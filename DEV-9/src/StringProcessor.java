import java.util.Random;

/**
 * Operates on strings.
 */
public class StringProcessor {
  final String WRONG_INPUT_MESSAGE = "Invalid input arguments.";

  /**
   * Replaces a random fragment from one line by a random fragment from the other.
   *
   * @param inputPair an array containing two input strings.
   * @throws IllegalAccessException if inputPair array contains less or more than two strings.
   */
  public void randomMerge(String[] inputPair) {
    if (inputPair.length != 2) {
      throw new IllegalArgumentException(WRONG_INPUT_MESSAGE);
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
   * @param inputPair an array containing two input strings.
   * @param firstFragmentIndex the beginning index of the middle fragment part of the first
   *                           string, inclusive.
   * @param firstFragmentLength the length of the middle fragment part of the first
   *                           string.
   * @param secondFragmentIndex the beginning index of the middle fragment part of the first
   *                            string, inclusive.
   * @param secondFragmentLength the length of the middle fragment part of the second
   *                           string.
   */
  private void merge(String[] inputPair, int firstFragmentIndex, int firstFragmentLength,
                     int secondFragmentIndex, int secondFragmentLength) {
    String[] splitFirst = splitOnThree(inputPair[0], firstFragmentIndex, firstFragmentLength);
    String[] splitSecond = splitOnThree(inputPair[1], secondFragmentIndex,
            secondFragmentLength);
    inputPair[0] = splitFirst[0] + splitSecond[1] + splitFirst[2];
    inputPair[1] = splitSecond[0] + splitFirst[1] + splitSecond[2];
  }

  /**
   * Splits the string into three parts. "Fragment" part is middle part.
   *
   * @param inputString the input string
   * @param fragmentIndex the beginning index of the middle fragment part of the string,
   *                      inclusive.
   * @param fragmentLength the fragment part length.
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
