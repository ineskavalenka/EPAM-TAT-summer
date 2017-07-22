import java.math.BigDecimal;

/**
 * Builds isosceles triangles.
 */
class IsoscelesTriangleBuilder implements BuilderChain {
  private BuilderChain nextInChain;
  
  /**
   * Sets next object in the responsibility chain.
   */
	public void setNext(BuilderChain c) {
		nextInChain = c;
	}

	/**
	 * Builds isosceles triangles.
	 */
 	public Triangle build(BigDecimal[] sides) {
		try {
		  return new IsoscelesTriangle(sides);
		} catch (IllegalArgumentException e) {
			return nextInChain.build(sides);
		}
	}
}
