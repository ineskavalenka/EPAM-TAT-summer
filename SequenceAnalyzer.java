/**
 * Analyzes integer sequences.
 */
class SequenceAnalyzer {
 /**
   * Determines, whether the input sequence of integers is non-decreasing,
   * and writes the result to the console.
   *
   * @param sequence a sequence to be analyzed; in case the sequence
   *                 has incorrect format, warnings will be written to the console. 
   */
  public void checkIfNonDecreasing (String[] sequence) {
    try {    
      if (sequence.length < 2) {
        throw new IllegalArgumentException();
      }
      for (int i = 0; i < sequence.length-1; i++) {
        if (Integer.parseInt(sequence[i]) > Integer.parseInt(sequence[i+1])) {
          System.out.println("Sequence is not non-decreasing.");
          return;
        }
    } 
      System.out.println("Sequence is non-decreasing.");
    } catch (NumberFormatException e) {
      System.out.println("Incorrect Input. Program exited."); 
    } catch (IllegalArgumentException e) {
      System.out.println("Sequence must contain at least two numbers. Program exited.");   
    }
  }
}
