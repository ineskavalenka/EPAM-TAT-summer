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
        BigDecimal sides[] = new BigDecimal[sequence.length];
        for (int i=0; i < sequence.length; i++) {
          sides[i] = new BigDecimal(Double.parseDouble(sequence[i])); 
        }      
        BuilderChain equilateral = new EquilateralTriangleBuilder();
        BuilderChain isosceles = new IsoscelesTriangleBuilder();
        BuilderChain regular = new TriangleBuilder();
        equilateral.setNext(isosceles);
        isosceles.setNext(regular);
        System.out.println("The triangle is " + equilateral.build(sides).toString() + ".");
        return;
      } catch (Exception e) {
        System.out.println("Incorrect input arguments.");
        System.out.println("The sequence of sides should contain three positive numbers.");  
      }
    } while (reader.askRepeatChecking("triangle"));        
  }
}
