import java.math.BigDecimal;

class IsoscelesTriangleBuilder implements Chain {
  private Chain nextInChain;

	public void setNext(Chain c) {
		nextInChain = c;
	}
 
 	public Triangle build(BigDecimal[] sides) {
		try {
		  System.out.println("Isosceles Triangle builder");
		//  return new IsoscelesTriangle(sides);
		  IsoscelesTriangle triangle = new IsoscelesTriangle(sides);
		  System.out.println("Isosceles Triangle has been built"); 
		  return triangle;
		} catch (IllegalArgumentException e) {
		  System.out.println("Isosceles Triangle builder caught exception");
			return nextInChain.build(sides);
		}
	}
}
