import java.math.BigDecimal;

class EquilateralTriangleBuilder implements Chain {
  private Chain nextInChain;

	public void setNext(Chain c) {
		nextInChain = c;
	}
	
	public Triangle build(BigDecimal[] sides) {
		try {
		  System.out.println("Equilateral Triangle builder");
		//  return new EquilateralTriangle(sides);
		  EquilateralTriangle triangle = new EquilateralTriangle(sides); 
		  System.out.println("Equilateral Triangle has been built");
		  return triangle;
		} catch (IllegalArgumentException e) {
		  System.out.println("Equilateral Triangle builder caught exception");
			return nextInChain.build(sides);
		}
	}
}
