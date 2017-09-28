import java.util.Random;

/**
 * Operates on strings.
 */
public class StringProcessor {
  /**
   * Replaces a random fragment from one line by a random fragment from the other.
   *
   * @param inputPair an object containing two input strings.
   */
  public void randomMerge(PairOfStrings inputPair) {
    Random random = new Random();
    int firstFragmentIndex = random.nextInt(inputPair.first.length());
    int firstFragmentLength = random.nextInt(inputPair.first.length() - firstFragmentIndex);
    int secondFragmentIndex = random.nextInt(inputPair.second.length());
    int secondFragmentLength = random.nextInt(inputPair.second.length() - secondFragmentIndex);
    merge(inputPair, firstFragmentIndex, firstFragmentLength, secondFragmentIndex, secondFragmentLength);
  }

  /**
   * Swaps the middle fragments of two input strings.
   *
   * @param inputPair an object containing two input strings.
   * @param firstFragmentIndex the beginning index of the middle fragment part of the first
   *                           string, inclusive.
   * @param firstFragmentLength the length of the middle fragment part of the first
   *                           string.
   * @param secondFragmentIndex the beginning index of the middle fragment part of the first
   *                            string, inclusive.
   * @param secondFragmentLength the length of the middle fragment part of the second
   *                           string.
   */
  private void merge(PairOfStrings inputPair, int firstFragmentIndex, int firstFragmentLength,
                     int secondFragmentIndex, int secondFragmentLength) {
    String[] splitFirst = splitOnThree(inputPair.first, firstFragmentIndex, firstFragmentLength);
    String[] splitSecond = splitOnThree(inputPair.second, secondFragmentIndex,
            secondFragmentLength);
    inputPair.first = splitFirst[0] + splitSecond[1] + splitFirst[2];
    inputPair.second = splitSecond[0] + splitFirst[1] + splitSecond[2];
  }

  /**
   * Splits the string into three parts. "Fragment" part is middle part.
   *
   * @param inputString
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
