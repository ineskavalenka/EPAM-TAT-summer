import java.math.BigDecimal;

class IsoscelesTriangleBuilder implements Chain {
  private Chain nextInChain;

	public void setNext(Chain c) {
		nextInChain = c;
	}
 
 	public Triangle build(BigDecimal[] sides) {
		try {
		  return new IsoscelesTriangle(sides);
		//  System.out.println("The triangle is isosceles.");
		} catch (Exception e) {
			return nextInChain.build(sides);
		}
	}
}
