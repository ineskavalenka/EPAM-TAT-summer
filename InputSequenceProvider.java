/**
 * Provides input sequences.
 */
class InputSequenceProvider {
  private String[] firstSequence;
   
  public InputSequenceProvider(String[] args) {
    firstSequence = args;
  } 
  
  /**
   * Gets the next input sequence.
   * When called for the first time, returns the value of firstSequence field as a sequence,
   * and sets that field empty.
   * When the subsequent callings occur, requests sequences from the console. 
   * 
   * @return the sequence.
   */ 
  public String[] provideInputSequence() {
    if (firstSequence.length == 0) {
      ConsoleReader reader = new ConsoleReader();  
      return reader.readSequence();
    } else {
      String[] tempSequence = firstSequence;
      /* to do : firstSequence field --> currentSequence field */ 
      firstSequence = new String[0];
      return tempSequence;
    }
  }
  
  /**
   * Gets the next input triangle sequence (a sequence of triangle sides).
   * When called for the first time, returns the value of firstSequence field as a sequence,
   * and sets that field empty.
   * When the subsequent callings occur, requests sequences from the console. 
   * 
   * @return the sequence.
   */ 
  public String[] provideInputTriangle() {
    // to do : how should I do this not violating DRY ?
    if (firstSequence.length == 0) {
      ConsoleReader reader = new ConsoleReader();  
      return reader.readTriangle();
    } else {
      String[] tempSequence = firstSequence;
      /* to do : firstSequence field --> currentSequence field */ 
      firstSequence = new String[0];
      return tempSequence;
    }
  }  
}
