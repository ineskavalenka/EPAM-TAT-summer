/**
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

    System.out.println(args[0]);
    System.out.println(args[1]);

    System.out.println("*");
    StringProcessor processor = new StringProcessor();
    processor.randomMerge(args);

    System.out.println(args[0]);
    System.out.println(args[1]);
  }
}
