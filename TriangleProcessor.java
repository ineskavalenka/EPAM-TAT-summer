import java.math.BigDecimal;

class TriangleProcessor implements Chain {
  private Chain nextInChain;

	public void setNext(Chain c) {
		nextInChain = c;
	}
	
 	public void process(BigDecimal[] sides) {
		try {
		  Triangle triangle = new Triangle(sides);
		  System.out.println("The triangle is scalene.");
		} catch (Exception e) {
			nextInChain.process(sides);
		}
	}
}
