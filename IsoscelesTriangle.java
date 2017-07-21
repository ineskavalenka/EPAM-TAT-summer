import java.math.BigDecimal;

/**
 * Describes isosceles triangles.
 */
class IsoscelesTriangle extends Triangle {
  int singleSideIndex;
  
  /**
   * IsoscelesTriangle constructor.
   *
   * @throws IllegalArgumentException if the triangle can't exist.
   */
  public IsoscelesTriangle(BigDecimal[] sides) {
    super(sides);
    type = new String("isosceles");
    if (!exists(sides)) {
      throw new IllegalArgumentException();
    }
    if (sides[0].equals(sides[1])) {
      singleSideIndex = 2;
    }
    if (sides[0].equals(sides[2])) {
      singleSideIndex = 1;
    }
    if (sides[1].equals(sides[2])) {
      singleSideIndex = 0;
    }
  }
  
  /**
   * Determines the existence of an isosceles triangle with given sides.
   *
   * @return true if the triangle exists and is isosceles,
   *         false if not.
   */
  public boolean exists(BigDecimal[] sides) {
    if (!super.exists(sides)) {
      return false;
    }  
    if (sides[0].equals(sides[1]) || sides[0].equals(sides[2]) || sides[1].equals(sides[2])) {
      return true;
    }
    return false;    
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
