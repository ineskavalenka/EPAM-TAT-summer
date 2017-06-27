import java.util.Scanner;

class NonDecreasingSequence {
  public static void main(String[] args) {
    System.out.println("Enter a sequence of integers separated by spaces.");  
    Scanner input = new Scanner(System.in);
    String sequence = input.nextLine();
    String sequenceSplit[] = sequence.split(" ");   
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
}
