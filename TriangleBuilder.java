import java.math.BigDecimal;

/**
 * Builds triangles.
 */
class TriangleBuilder implements BuilderChain {
  private BuilderChain nextInChain;

  /**
   * Sets next object in the responsibility chain.
   */
	public void setNext(BuilderChain c) {
		nextInChain = c;
	}

	/**
	 * Builds triangles.
	 */	
 	public Triangle build(BigDecimal[] sides) {
		try {
		  return new Triangle(sides);
		} catch (IllegalArgumentException e) {
			return nextInChain.build(sides);
		}
	}
}
