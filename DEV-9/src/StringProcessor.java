import java.util.Random;

/**
 * Operates on strings.
 */
public class StringProcessor {
  final int NUMBER_OF_INPUT_STRINGS = 2;

  /**
   * Replaces a random fragment from one line by a random fragment from the other.
   *
   * @param inputPair an array containing two input strings.
   * @throws IllegalAccessException if inputPair array contains less or more than two strings.
   */
  public void randomMerge(String[] inputPair) {
    if (inputPair.length != NUMBER_OF_INPUT_STRINGS) {
      throw new IllegalArgumentException();
    }
    Random random = new Random();
    int firstFragmentIndex = random.nextInt(inputPair[0].length());
    int firstFragmentLength = random.nextInt(inputPair[0].length() - firstFragmentIndex);
    int secondFragmentIndex = random.nextInt(inputPair[1].length());
    int secondFragmentLength = random.nextInt(inputPair[1].length() - secondFragmentIndex);
    merge(inputPair, firstFragmentIndex, firstFragmentLength, secondFragmentIndex, secondFragmentLength);
  }

  /**
   * Swaps the middle fragments of two input strings.
   *
   * @param inputStrings an array containing two input strings.
   * @param firstFragmentIndex the beginning index of the middle fragment part of the first
   *                           string, inclusive.
   * @param firstFragmentLength the length of the middle fragment part of the first
   *                            string.
   * @param secondFragmentIndex the beginning index of the middle fragment part of the first
   *                            string, inclusive.
   * @param secondFragmentLength the length of the middle fragment part of the second
   *                             string.
   */
  private void merge(String[] inputStrings, int firstFragmentIndex, int firstFragmentLength,
      int secondFragmentIndex, int secondFragmentLength) {
    String[] splitFirst = splitOnThree(inputStrings[0], firstFragmentIndex, firstFragmentLength);
    String[] splitSecond = splitOnThree(inputStrings[1], secondFragmentIndex, secondFragmentLength);
    inputStrings[0] = splitFirst[0] + splitSecond[1] + splitFirst[2];
    inputStrings[1] = splitSecond[0] + splitFirst[1] + splitSecond[2];
  }

  /**
   * Splits the string into three parts.
   *
   * @param inputString the input string
   * @param fragmentIndex the beginning index of the middle part of the string, inclusive.
   * @param fragmentLength the middle part length.
   * @return the array containing three parts.
   */
  private String[] splitOnThree(String inputString, int fragmentIndex, int fragmentLength) {
    int fragmentEndIndex = fragmentIndex + fragmentLength;
    String[] output = new String[3];
    output[0] = inputString.substring(0, fragmentIndex);
    output[1] = inputString.substring(fragmentIndex, fragmentEndIndex);
    output[2] = inputString.substring(fragmentEndIndex, inputString.length());
    return output;
  }
}
