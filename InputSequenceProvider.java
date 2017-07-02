/**
 * Provides input sequences.
 */
class InputSequenceProvider {
  /**
   * Gets the next input sequence from command line arguments or from console.
   * If the command line arguments contain information, their content is returned as a sequence,
   * If not, the sequence is requested from the console. 
   * 
   * @param args command line arguments. 
   * @return     the sequence.
   */
  public String[] provideInputSequence(String[] args) {
    if (args.length != 0) { 
      return args; 
    } else {
      ConsoleReader reader = new ConsoleReader();  
      return reader.readSequence(); 
    }
  }
}
