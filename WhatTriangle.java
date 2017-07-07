/** 
 * Requests a triangle from console and determines it's type.
 * Outputs the results to the console.
 */
class WhatTriangle {
  public static void main(String[] args) {
    ConsoleReader reader = new ConsoleReader();
    InputSequenceProvider sequenceProvider = new InputSequenceProvider(args);      
    do {  
      try {
        String[] sequence = sequenceProvider.provideInputTriangle();
        Triangle triangle = new Triangle(sequence);   
        TriangleAnalyzer analyzer = new TriangleAnalyzer(triangle);
        System.out.print("This triangle: ");
   
        if(analyzer.checkIfEquilateral()) {
          System.out.println("is equilateral.");
        } else {
          if (analyzer.checkIfRight()) {
            System.out.println("is right.");
          }
          if (analyzer.checkIfIsosceles()) {
            System.out.println("is isosceles.");
          } else if (analyzer.checkIfScalene()) {
            System.out.println("is scalene.");
          }        
        }
        return;
      } catch (Exception e) { 
        System.out.println("Incorrect input arguments.");
        System.out.println("The sequence of sides should contain three positive numbers."); 
      } 
    } while (reader.askRepeatChecking("triangle"));        
  }
}
