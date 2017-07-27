import java.math.BigDecimal;

/**
 * Chain of Builders responsibility.
 */
public interface BuilderChain {
  /**
   * Sets next object in the responsibility chain.
   */
  public abstract void setNext(BuilderChain nextInChain);

  /**
   * Builds triangles.
   */
  public abstract Triangle build(BigDecimal[] sides);
}