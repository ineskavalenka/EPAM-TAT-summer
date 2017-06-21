/**
 * Prints numbers from 0 to 100. 
 * All the multiples of 3 are replaced by "Tutti",
 * All the multiples of 5 are replaced by "Frutti",
 * All the multiples of 15 are replaced by "Tutti-Frutti".
 */
class TaskDevFirst {
  public static void main(String[] args) {
    final int START_COUNT = 0;
    final int END_COUNT = 100;
		
    for (int i = START_COUNT; i <= END_COUNT; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("Tutti-Frutti");
      } else if (i % 3 == 0) {
        System.out.println("Tutti");
      } else if (i % 5 == 0) {    
        System.out.println("Frutti");
      } else { 
        System.out.println(i);
      }
    }
  }
}
