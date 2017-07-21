import java.math.BigDecimal;

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
        BigDecimal sides[] = new BigDecimal[NUMBER_OF_SIDES];
        for (int i=0; i < NUMBER_OF_SIDES; i++) {
          sides[i] = new BigDecimal(Double.parseDouble(sequence[i])); 
        }       
        
        Chain c1 = new EquilateralProcessor();
		Chain c2 = new IsoscelesProcessor();
		Chain c3 = new TriangleProcessor();
		Chain c4 = new  WrongTriangleProcessor();
		c1.setNext(c2);
		c2.setNext(c3);
    c3.setNext(c4);
    
		//calling chain of responsibility
		c1.process(sides);

        
        
        
        
        
        
        
        
        
        /*
        try {
          EquilateralTriangle triangle = new EquilateralTriangle(sides);
          System.out.println("The triangle is equilateral.");
        } catch (Exception a) {
          try {
            IsoscelesTriangle triangle = new IsoscelesTriangle(sides);
            System.out.println("The triangle is isosceles.");
          } catch (Exception b) {
            try {
              Triangle triangle = new Triangle(sides);   
              System.out.println("The triangle is scalene.");
            } catch (Exception c) {
              System.out.println("The triangle does not exist.");
            }
          }
        }
        */ 
        return;
      } catch (Exception e) { 
        System.out.println("Incorrect input arguments.");
        System.out.println("The sequence of sides should contain three positive numbers."); 
      } 
   
    } while (reader.askRepeatChecking("triangle"));        
  }
}
