/**
 * Determines, whether the input sequence of integers is non-decreasing.
 * The user can enter the sequence as a command-line argument.
 * If the user doesn't enter the sequence as a command-line argument,
 * the program requests a sequence from the console.
 * 
 * An additional task was to request the sequence until we could analyze it.
 */
class IsNonDecreasing {
  public static void main(String[] args) {
    SequenceAnalyzer analyzer = new SequenceAnalyzer();
    boolean isNonDecreasing = false;
    ConsoleReader reader = new ConsoleReader();
    String[] inputSequence = args;
    if (args.length == 0) {   
      inputSequence = reader.readSequence();
    }
    boolean isRepeatRequired = true;
    while (isRepeatRequired) {
      try {  
        isNonDecreasing = analyzer.checkIfNonDecreasing(inputSequence);
        //no exceptions => we have result
        isRepeatRequired = false;
        if (isNonDecreasing) {
          System.out.println("Sequence is non-decreasing.");
        } else {
          System.out.println("Sequence is not non-decreasing.");
        }
      } catch (Exception e) {
        System.out.println("Incorrect input arguments."); 
        System.out.println("Sequence must be integer and contain at least two numbers.");
        if (reader.askRepeat()) {
          inputSequence = reader.readSequence();
          isRepeatRequired = true;
        } else {
          isRepeatRequired = false;
        } 
      }
    }         
  }
}
