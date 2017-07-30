import java.math.BigDecimal;

/**
 * Builds triangles.
 */
class TriangleBuilder extends BuilderChain {

  /**
   * TriangleBuilder constructor.
   *
   * @param nextInChain next object in the responsibility chain.
   */
  public TriangleBuilder(BuilderChain nextInChain) {
    this.nextInChain = nextInChain;
  }

  /**
   * Builds triangles.
   *
   * @throws IllegalArgumentException if the triangle can't be built, and .this is the last
   *                                  object in the chain of responsibility.
   * @param sides the sides of the triangle to be built.
   * @return the triangle that was built.
   */
  public Triangle build(BigDecimal[] sides) throws IllegalArgumentException {
    try {
      return new Triangle(sides);
    } catch (Exception e) {
      if (nextInChain != null) {
        return nextInChain.build(sides);
      }
      throw e;
    }
  }
}