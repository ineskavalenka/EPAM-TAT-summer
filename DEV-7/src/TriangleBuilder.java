import java.math.BigDecimal;

/**
 * Builds triangles.
 */
class TriangleBuilder implements BuilderChain {
  private BuilderChain nextInChain;

 /**
  * Sets next object in the responsibility chain.
  */
  public void setNext(BuilderChain next) {
    nextInChain = next;
  }

 /**
  * Builds triangles.
  */
  public Triangle build(BigDecimal[] sides) {
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