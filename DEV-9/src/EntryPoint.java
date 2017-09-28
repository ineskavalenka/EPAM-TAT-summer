/**
 * 26.09.17 20.59
 * <p>
 * Task
 * Name=DEV-9
 * Deadline=29/09/2017 23-00
 * Two strings are given [expected the from args[]]
 * Replace a consecutive group of characters, selected randomly in one line, by a random group of
 * consecutive characters selected from the other.
 * Output the original strings and the strings after processing to the console.
 */
public class EntryPoint {
  public static void main(String[] args) {
    if (args.length < 2) {
      System.out.println("No input arguments. Input arguments must be passed as args[0] and " +
              "args[1]. Program exited.");
      return;
    }
    PairOfStrings inputPair = new PairOfStrings(args[0], args[1]);

    System.out.println(inputPair.first);
    System.out.println(inputPair.second);

    System.out.println("*");
    StringProcessor processor = new StringProcessor();
    processor.randomMerge(inputPair);

    System.out.println(inputPair.first);
    System.out.println(inputPair.second);
  }
}
