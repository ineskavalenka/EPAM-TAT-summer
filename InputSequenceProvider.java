/**
 * Provides input sequences.
 */
class InputSequenceProvider {
  /**
   * Gets the next input sequence from command line arguments or from console.
   * If the command line arguments contain information, their content is returned as a sequence,
   * and the command line arguments are erased. If not, the sequence is requested from the console. 
   * 
   * @param args command line arguments. 
   * @return     the sequence.
   */
  public String[] provideInputSequence(String[] args) {
    String[] inputSequence = args;
    if (args.length != 0) { 
     args = new String[0];
    } else {
      ConsoleReader reader = new ConsoleReader();
      inputSequence = reader.readSequence();
    }
    return inputSequence;
  }
}
