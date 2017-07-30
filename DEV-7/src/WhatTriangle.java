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
        BuilderChain builderChain = new EquilateralTriangleBuilder(
          new IsoscelesTriangleBuilder(new TriangleBuilder(null)));
        System.out.println("The triangle is " + builderChain.build(sides).toString() + ".");
        return;
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    } while (reader.askRepeatChecking("triangle"));
  }
}