import java.math.BigDecimal;

class EquilateralProcessor implements Chain {
  private Chain nextInChain;

	public void setNext(Chain c) {
		nextInChain = c;
	}
	
	public void process(BigDecimal[] sides) {
		try {
		  EquilateralTriangle triangle = new EquilateralTriangle(sides);
		  System.out.println("The triangle is equilateral.");
		} catch (Exception e) {
			nextInChain.process(sides);
		}
	}
}
