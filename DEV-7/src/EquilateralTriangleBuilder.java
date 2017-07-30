import java.math.BigDecimal;

/**
 * Builds equilateral triangles.
 */
class EquilateralTriangleBuilder extends BuilderChain {

  /**
   * EquilateralTriangleBuilder constructor.
   *
   * @param nextInChain next object in the responsibility chain.
   */
  public EquilateralTriangleBuilder(BuilderChain nextInChain) {
    this.nextInChain = nextInChain;
  }

  /**
   * Builds isosceles triangles.\
   *
   * @throws IllegalArgumentException if the triangle can't be built, and .this is the last
   *                                  object in the chain of responsibility.
   * @param sides the sides of the triangle to be built.
   * @return the triangle that was built.
   */
  public Triangle build(BigDecimal[] sides) throws IllegalArgumentException {
    try {
      return new EquilateralTriangle(sides);
    } catch (Exception e) {
      if (nextInChain != null) {
        return nextInChain.build(sides);
      }
      throw e;
    }
  }
}