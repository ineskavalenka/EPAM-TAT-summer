/** 
 * Requests a triangle from console and determines it's type.
 * Outputs the results to the console.
 */
class WhatTriangle {
  final static int NUMBER_OF_SIDES = 3;
  
  public static void main(String[] args) {
    ConsoleReader reader = new ConsoleReader();
    InputSequenceProvider sequenceProvider = new InputSequenceProvider(args);      
    do {  
      try {
        String[] sequence = sequenceProvider.provideInputTriangle();
        
        SequenceAnalyzer sequenceAnalyzer = new SequenceAnalyzer();
        if (!sequenceAnalyzer.checkIfTriangleSides(sequence)) {
          throw new IllegalArgumentException();
        }
        
        double sides[] = new double[NUMBER_OF_SIDES];
        for (int i=0; i < NUMBER_OF_SIDES; i++) {
          sides[i] = Double.parseDouble(sequence[i]); 
        }
        
        Triangle triangle = new Triangle(sides);   
        TriangleAnalyzer triangleAnalyzer = new TriangleAnalyzer(triangle);
        System.out.print("This triangle: ");
        if(triangleAnalyzer.checkIfEquilateral()) {
          System.out.println("is equilateral.");
        } else {
          if (triangleAnalyzer.checkIfRight()) {
            System.out.println("is right.");
          }
          if (triangleAnalyzer.checkIfIsosceles()) {
            System.out.println("is isosceles.");
          } else if (triangleAnalyzer.checkIfScalene()) {
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
