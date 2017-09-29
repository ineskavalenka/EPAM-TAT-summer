/**
 * Two strings are given [expected the from args[]]
 * Replace a consecutive group of characters, selected randomly in one line, by a random group of
 * consecutive characters selected from the other.
 * Output the original strings and the strings after processing to the console.
 */
public class EntryPoint {
  final static String NO_INPUT_MESSAGE = "No input arguments. Program exited.";
  final static int NUMBER_OF_INPUT_STRINGS = 2;

  public static void main(String[] args) {
    try {
      String[] inputStrings = new String[NUMBER_OF_INPUT_STRINGS];
      for (int i = 0; i < NUMBER_OF_INPUT_STRINGS; i++) {
        inputStrings[i] = args[i];
      }
      System.out.println("Before processing:");
      System.out.println(inputStrings[0]);
      System.out.println(inputStrings[1]);

      StringProcessor processor = new StringProcessor();
      processor.randomMerge(inputStrings);

      System.out.println("After processing:");
      System.out.println(inputStrings[0]);
      System.out.println(inputStrings[1]);
    } catch (Exception e) {
      System.out.println(NO_INPUT_MESSAGE);
    }
  }
}
