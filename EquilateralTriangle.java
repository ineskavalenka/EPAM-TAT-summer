import java.math.BigDecimal;

/**
 * Describes equilateral triangles.
 */
class EquilateralTriangle extends Triangle {
  double repeatingSide;
  private String type = new String("equilateral");
  
  /**
   * EquilateralTriangle constructor.
   *
   * @throws IllegalArgumentException if the triangle can't exist.
   */
  public EquilateralTriangle(double[] sides) {
    super(sides);
    if (!exists(sides)) {
      throw new IllegalArgumentException();
    }
    repeatingSide = sides[0];
  }
  
  /**
   * Determines the existence of an equilateral triangle with given sides.
   *
   * @return true if the triangle exists and is equilateral,
   *         false if not.
   */
  public boolean exists(double[] sides) {
    if (!super.exists(sides)) {
      return false;
    }  
    BigDecimal sideA = new BigDecimal(sides[0]);
    BigDecimal sideB = new BigDecimal(sides[1]);
    BigDecimal sideC = new BigDecimal(sides[2]);
    if (sideA.equals(sideB) && sideA.equals(sideC)) {
      return true;
    }
    return false;    
  }
}
