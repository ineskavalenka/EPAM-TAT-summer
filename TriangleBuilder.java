import java.math.BigDecimal;

class TriangleBuilder implements Chain {
  private Chain nextInChain;

	public void setNext(Chain c) {
		nextInChain = c;
	}
	
 	public Triangle build(BigDecimal[] sides) {
		try {
		  System.out.println("Triangle builder");
		//  return new Triangle(sides);
		  Triangle triangle = new Triangle(sides); 
		  System.out.println("Scalene Triangle has been built");
		  return triangle;
		} catch (IllegalArgumentException e) {
		  System.out.println("Triangle builder caught exception");
			return nextInChain.build(sides);
		}
	}
}
