import java.util.Scanner;

/**
 * Determines, whether the input sequence of integers is non-decreasing.
 * The user can enter the sequence as a command-line argument.
 * If the user doesn't enter the sequence as a command-line argument,
 * the program requests a sequence from the console.
 */
class IsNonDecreasing {
/**
 * Determines, whether the input sequence of integers is non-decreasing,
 * and writes the result to the console.
 */
  public static void checkIfNonDecreasing (String[] sequenceSplit) {
    try {    
      if (sequenceSplit.length < 2) {
        throw new IllegalArgumentException();
      }
      for (int i = 0; i < sequenceSplit.length-1; i++) {
        if (Integer.parseInt(sequenceSplit[i]) > Integer.parseInt(sequenceSplit[i+1])) {
          System.out.println("Sequence is not non-decreasing.");
          return;
        }
    } 
      System.out.println("Sequence is non-decreasing.");
    } catch (NumberFormatException e) {
      System.out.println( "Incorrect Input. Program exited." ); 
    } catch (IllegalArgumentException e) {
      System.out.println( "Sequence must contain at least two numbers. Program exited." );   
    }
  }

  public static void main(String[] args) {
    try {    
      if (args.length == 0) {
      throw new IllegalArgumentException();      
      } 
      checkIfNonDecreasing (args);
    } catch (IllegalArgumentException e) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a sequence of integers separated by spaces.");  
      String sequence = input.nextLine();
      String sequenceSplit[] = sequence.split(" "); 
      checkIfNonDecreasing(sequenceSplit);
    }
  }
}
