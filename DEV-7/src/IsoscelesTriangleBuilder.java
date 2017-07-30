import java.math.BigDecimal;

/**
 * Builds isosceles triangles.
 */
class IsoscelesTriangleBuilder extends BuilderChain {

  /**
   * IsoscelesTriangleBuilder constructor.
   *
   * @param nextInChain next object in the responsibility chain.
   */
  public IsoscelesTriangleBuilder(BuilderChain nextInChain) {
    this.nextInChain = nextInChain;
  }

  /**
   * Builds isosceles triangles.
   *
   * @throws IllegalArgumentException if the triangle can't be built, and .this is the last
   *                                  object in the chain of responsibility.
   * @param sides the sides of the triangle to be built.
   * @return the triangle that was built.
   */
  public Triangle build(BigDecimal[] sides) throws IllegalArgumentException {
    try {
      return new IsoscelesTriangle(sides);
    } catch (Exception e) {
      if (nextInChain != null) {
        return nextInChain.build(sides);
      }
      throw e;
    }
  }
}