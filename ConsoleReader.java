import java.util.Scanner;

/** 
 * Reads from console.
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
   * Requests the sides of a triangle from the console,
   * but doesn't check if they are entered correctly.
   *
   * @return the entered sides of a triangle.
   */    
    public String[] readTriangle() { 
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the sides of a triangle separated by spaces.");
    String triangleSides = input.nextLine();
    String triangleSidesSplit[] = triangleSides.split(" ");
    return triangleSidesSplit;
  }
  
  /**
   * Asks if user wants to re-enter parameters of the thing we're checking;
   * 
   * @param whatIsChecked name of what we're checking, starting from 
   *                      lowercase if it's not proper name.
   * @return true if yes, false if no. 
   */
  public boolean askRepeatChecking(String whatIsChecked) {
    Scanner input = new Scanner(System.in);
    boolean isRepeatRequired = true;
    while (isRepeatRequired) {
      System.out.println("Check another " + whatIsChecked + "? Y/N");   
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
