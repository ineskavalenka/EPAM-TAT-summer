/**
 * The program checks, whether a non-negative integer <x> is a Fibonacci number.
 * <x> is a command-line argument.
 * Example:
 * > java IsFibonacci 8
 * 8 is Fibonacci.
 * Program exited.
 */
class IsFibonacci {
  public static boolean isNumberFibonacci(int numberToCheck) {
    if (numberToCheck == 0 || numberToCheck == 1) {
     return true;
    } else {
      int firstInSequence = 1;
      int secondInSequence = 1;
      int thirdInSequence = 2;
      for (int i = 1; thirdInSequence <= numberToCheck; i++) {
        int temp = firstInSequence + secondInSequence;
        firstInSequence = secondInSequence;
        secondInSequence = thirdInSequence;
        thirdInSequence = temp;			
        if (thirdInSequence  == numberToCheck) {
          return true;
        }			
      }
      return false;
    }
  }
  
  private static boolean isPerfectSquare(int num) {
    double sqrt = Math.sqrt(num);
    return sqrt * sqrt == num;
  }
  
  public static void main(String[] args) {
    try {
      int num = Integer.parseInt(args[0]);
      if (num < 0) {
        throw new Exception();
      }
      if (isNumberFibonacci(num)) {
        System.out.println(num + " is Fibonacci.");
      } else {
        System.out.println(num + " is not Fibonacci.");
      }
    } catch (Exception e) { 
      System.out.println("Incorrect input.");
      System.out.println("Input number should be a non-negative integer, less than 2147483647.");
    } finally { 
      System.out.println("Program exited.");
    }
  }
}
