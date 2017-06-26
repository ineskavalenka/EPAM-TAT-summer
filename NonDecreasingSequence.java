import java.util.Scanner;

class NonDecreasingSequence {
  public static void main(String[] args) {
    System.out.println("Enter a sequence of integers separated by spaces.");  
    Scanner input = new Scanner (System.in);
    String sequence = input.nextLine();
    String sequenceSplit[] = sequence.split(" ");   
    boolean isNonDecreasing = true;   
    if (sequenceSplit.length < 2)
    {
      System.out.println("Sequence must contain at least two numbers. Program exited.");
    } else {
      try { 
        for (int i = 0; i < sequenceSplit.length-1; i++) {
          if (Integer.parseInt(sequenceSplit[i]) > Integer.parseInt(sequenceSplit[i+1])) {
            isNonDecreasing = false;
            System.out.println("Sequence is not non-decreasing.");
            break;
          }
        }  
        if (isNonDecreasing == true) {
          System.out.println("Sequence is non-decreasing.");
        }
      } catch (Exception e) {
        System.out.println("Incorrect Input. Program exited.");
      }
    }
  }
}
