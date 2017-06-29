/**
 * Determines, whether the input sequence of integers is non-decreasing.
 * The user can enter the sequence as a command-line argument.
 * If the user doesn't enter the sequence as a command-line argument,
 * the program requests a sequence from the console.
 */
class IsNonDecreasing {
  public static void main(String[] args) {
    try {    
      if (args.length == 0) {
        throw new IllegalArgumentException();      
      } 
      SequenceAnalyzer analyzer = new SequenceAnalyzer();
      analyzer.checkIfNonDecreasing(args);
    } catch (IllegalArgumentException e) {
      ReadFromConsole reader = new ReadFromConsole();
      SequenceAnalyzer analyzer = new SequenceAnalyzer();
      analyzer.checkIfNonDecreasing(reader.readSequence());
    }
  }
}
