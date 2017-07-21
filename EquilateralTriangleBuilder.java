import java.math.BigDecimal;

class EquilateralTriangleBuilder implements Chain {
  private Chain nextInChain;

	public void setNext(Chain c) {
		nextInChain = c;
	}
	
	public Triangle build(BigDecimal[] sides) {
		try {
		  return new EquilateralTriangle(sides);
		//  System.out.println("The triangle is equilateral.");
		} catch (Exception e) {
			return nextInChain.build(sides);
		}
	}
}
