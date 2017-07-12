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
        double sides[] = new double[NUMBER_OF_SIDES];
        for (int i=0; i < NUMBER_OF_SIDES; i++) {
          sides[i] = Double.parseDouble(sequence[i]); 
        }
                
        try {
          EquilateralTriangle equi = new EquilateralTriangle(sides);
          System.out.println("equilateral created");
        } catch (Exception a) {
          try {
            IsoscelesTriangle iso = new IsoscelesTriangle(sides);
            System.out.println("isosceles created");
          } catch (Exception b) {
            try {
              Triangle triangle = new Triangle(sides);   
              System.out.println("is scalene.");
            } catch (Exception c) {
              System.out.println("does not exist");
            }
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
