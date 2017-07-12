/**
 * Analyzes sequences.
 */
class SequenceAnalyzer {
  final int NUMBER_OF_TRIANGLE_SIDES = 3;
  
  /**
   * Determines whether the input sequence of integers is non-decreasing.
   *
   * @param sequence a sequence to be analyzed;
   * @return true if the sequence is non-decreasing, false if not.
   * @throws IllegalArgumentException if the sequence contains less than two numbers.
   * @throws NumberFormatException if sequence members are not integers.
   */
  public boolean checkIfNonDecreasing(String[] sequence) 
  throws IllegalArgumentException, NumberFormatException {
    if (sequence.length < 2) {
      throw new IllegalArgumentException();
    }
    for (int i = 0; i < sequence.length-1; i++) {
      if (Integer.parseInt(sequence[i]) > Integer.parseInt(sequence[i+1])) {
        return false;
      }
    } 
    return true;
  }
}
