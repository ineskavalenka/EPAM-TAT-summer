import java.math.BigDecimal;

class IsoscelesProcessor implements Chain {
  private Chain nextInChain;

	public void setNext(Chain c) {
		nextInChain = c;
	}
 
 	public void process(BigDecimal[] sides) {
		try {
		  IsoscelesTriangle triangle = new IsoscelesTriangle(sides);
		  System.out.println("The triangle is isosceles.");
		} catch (Exception e) {
			nextInChain.process(sides);
		}
	}
}
