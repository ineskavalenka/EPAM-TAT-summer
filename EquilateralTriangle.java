import java.math.BigDecimal;

/**
 * Describes equilateral triangles.
 */
class EquilateralTriangle extends Triangle {
  
  /**
   * EquilateralTriangle constructor.
   *
   * @throws IllegalArgumentException if the triangle can't exist.
   */
  public EquilateralTriangle(BigDecimal[] sides) {
    super(sides);
    type = new String("equilateral");
    if (!exists(sides)) {
      throw new IllegalArgumentException();
    }
  }
  
  /**
   * Determines the existence of an equilateral triangle with given sides.
   *
   * @return true if the triangle exists and is equilateral,
   *         false if not.
   */
  public boolean exists(BigDecimal[] sides) {
    if (!super.exists(sides)) {
      return false;
    }  
    return (sides[0].equals(sides[1]) && sides[0].equals(sides[2]));    
  }
  /**
   * Returns triangle type.
   *
   * @return triangle type.
   */
  @Override
  public String toString() {
    return type;
  }
}
