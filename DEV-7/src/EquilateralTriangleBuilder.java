import java.math.BigDecimal;

/**
 * Builds equilateral triangles.
 */
class EquilateralTriangleBuilder implements BuilderChain {
  private BuilderChain nextInChain;

  /**
   * Sets next object in the responsibility chain.
   */
  public void setNext(BuilderChain next) {
    nextInChain = next;
  }

  /**
   * Builds equilateral triangles.
   */
  public Triangle build(BigDecimal[] sides) {
    try {
      return new EquilateralTriangle(sides);
    } catch (IllegalArgumentException e) {
      return nextInChain.build(sides);
    }
  }
}