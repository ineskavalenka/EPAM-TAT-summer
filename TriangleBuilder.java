import java.math.BigDecimal;

class TriangleBuilder implements Chain {
  private Chain nextInChain;

	public void setNext(Chain c) {
		nextInChain = c;
	}
	
 	public Triangle build(BigDecimal[] sides) {
		try {
		  return new Triangle(sides);
		//  System.out.println("The triangle is scalene.");
		} catch (Exception e) {
			return nextInChain.build(sides);
		}
	}
}
