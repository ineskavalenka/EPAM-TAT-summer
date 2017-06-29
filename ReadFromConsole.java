import java.util.Scanner;

/** 
 * Reads sequences from console.
 */
class ReadFromConsole {
  /**
   * Requests a sequence of integers from the console,
   * but doesn't check if the sequence is entered correctly.
   *
   * @return the entered sequence.
   */
  public String[] readSequence() { 
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a sequence of integers separated by spaces.");
    String sequence = input.nextLine();
    String sequenceSplit[] = sequence.split(" ");
    return sequenceSplit;
  }
}
