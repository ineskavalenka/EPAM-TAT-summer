import java.util.Scanner;

class NonDecreasingSequence {
  public static void main(String[] args) {
    System.out.println("Enter a sequence of integers separated by spaces.");  
    Scanner input = new Scanner(System.in);
    String sequence = input.nextLine();
    String sequenceSplit[] = sequence.split(" ");   
    if (sequenceSplit.length < 2)
    {
      System.out.println("Sequence must contain at least two numbers. Program exited.");
    } else {
      try { 
        int i;
        for (i = 0; i < sequenceSplit.length-1; i++) {
          if (Integer.parseInt(sequenceSplit[i]) > Integer.parseInt(sequenceSplit[i+1])) {
            break;
          }
        } 
        if (i == sequenceSplit.length-1) {
          System.out.println("Sequence is non-decreasing.");
        } else {
          System.out.println("Sequence is not non-decreasing.");
        }
      } catch (Exception e) {
        System.out.println("Incorrect Input. Program exited.");
      }
    }
  }
}
