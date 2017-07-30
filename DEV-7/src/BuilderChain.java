import java.math.BigDecimal;

/**
 * Chain of Builders responsibility.
 */
abstract class BuilderChain {
  protected BuilderChain nextInChain;

  /**
   * Builds triangles.
   */
  public abstract Triangle build(BigDecimal[] sides);
}