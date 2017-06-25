/**
 * The program checks, whether a non-negative integer <x> is a Fibonacci number.
 * <x> is a command-line argument.
 * Example:
 * > java IsFibonacci 8
 * 8 is Fibonacci.
 * Program exited.
 */
class IsFibonacci {
  public static boolean isNumberFibSeq(int num) {
    if (num == 0 || num == 1) {
     return true;
    } else {
      // 5n^2 - 4 OR 5n^2 + 4 should be perfect squares
      return isPerfectSquare(5*num*num - 4) || isPerfectSquare(5*num*num + 4);
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
      if (isNumberFibSeq(num)) {
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
