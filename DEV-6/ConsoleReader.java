import java.util.Scanner;

/** 
 * Reads sequences from console.
 */
class ConsoleReader {
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
  
  /**
   * Asks if user wants to re-enter the sequence;
   * 
   * @return true if yes, false if no. 
   */
  public boolean askRepeat() {
    Scanner input = new Scanner(System.in);
    boolean isRepeatRequired = true;
    while (isRepeatRequired) {
      System.out.println("Check another sequence? Y/N");   
      String answer = input.nextLine();  
      if (answer.equalsIgnoreCase("Y")) {
        return true;
      } else if (answer.equalsIgnoreCase("N")) {
        return false;
      } 
    }
    return false;
  }
}
