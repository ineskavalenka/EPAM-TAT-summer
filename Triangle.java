import java.math.BigDecimal;

/**
 * Describes triangles with double sides.
 */
class Triangle {
  final BigDecimal ZERO = new BigDecimal(0);
  final BigDecimal ONE = new BigDecimal(1);
  final int NUMBER_OF_SIDES = 3;
  final String type = new String("regular");
  //private double[] sides = new double[NUMBER_OF_SIDES];
  private BigDecimal[] sides = new BigDecimal[NUMBER_OF_SIDES];
  /**
   * Triangle constructor; makes a triangle from the sequence of its sides.
   *
   * @param sides a sequence of triangle sides
   * @throws IllegalArgumentException if the sequence has not three sides.
   */
  public Triangle(BigDecimal[] sides) {
    if (!exists(sides)) {
      throw new IllegalArgumentException();
    }       
  }
  
  /**
   * Triangle side getter.
   *
   * @return the sequence of this.sides.
   */
  public BigDecimal[] getSides() {
    return sides;
  }
  
  /**
   * Determines the existence of a triangle with given sides.
   *
   * @return true if the triangle exists,
   *         false if not.
   */
  public boolean exists(BigDecimal[] sides) {
    if (sides.length != NUMBER_OF_SIDES) {
      return false;
    }
    for (int i = 0; i < NUMBER_OF_SIDES; i++) {
      if (sides[i].compareTo(ZERO) != 1) {
        return false;
      }
    }
    if ((sides[0].add(sides[1]).subtract(sides[2]).compareTo(ZERO) != 1) ||
    (sides[1].add(sides[2]).subtract(sides[0]).compareTo(ZERO) != 1) || 
    (sides[0].add(sides[2]).subtract(sides[1]).compareTo(ZERO) != 1)) {
      return false;
    }
    return true;
  }
  
  /**
   * Returns triangle type.
   *
   * @return triangle type.
   */
  public String toString() {
    return type;
  }
}
