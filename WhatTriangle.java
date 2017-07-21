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
        
        Chain equilateral = new EquilateralTriangleBuilder();
    		Chain isosceles = new IsoscelesTriangleBuilder();
    		Chain regular = new TriangleBuilder();
   // 		Chain wrong = new WrongTriangleProcessor();
    		equilateral.setNext(isosceles);
    		isosceles.setNext(regular);
      //  regular.setNext(wrong);
    
		//calling chain of responsibility
		    Triangle triangle = equilateral.build(sides);
        System.out.println(triangle.toString());
        
        return;
      } catch (Exception e) { 
        System.out.println("Incorrect input arguments.");
        System.out.println("The sequence of sides should contain three positive numbers."); 
      } 
   
    } while (reader.askRepeatChecking("triangle"));        
  }
}
