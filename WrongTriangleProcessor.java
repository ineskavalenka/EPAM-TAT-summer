import java.math.BigDecimal;

class WrongTriangleProcessor implements Chain {
  private Chain nextInChain;

	public void setNext(Chain c) {
		nextInChain = c;
	}
	
 	public void build(BigDecimal[] sides) {
		System.out.println("The triangle does not exist.");
	}
}
