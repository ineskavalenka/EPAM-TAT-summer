import java.math.BigDecimal;

/**
 * Describes equilateral triangles.
 */
class EquilateralTriangle extends Triangle {
  final String type = "equilateral";

  /**
   * EquilateralTriangle constructor.
   *
   * @throws IllegalArgumentException if the triangle can't exist.
   */
  public EquilateralTriangle(BigDecimal[] sides) {
    super(sides);
    exists(sides);
  }

  /**
   * Determines the existence of an equilateral triangle with given sides.
   *
   * @throws IllegalArgumentException if the triangle can't exist. The exception contains
   *                                  a message describing why the triangle can't exist.
   */
  public void exists(BigDecimal[] sides) {
    super.triangleExists(sides);
    if (!(sides[0].equals(sides[1]) && sides[0].equals(sides[2])))
      throw new IllegalArgumentException("Equilateral triangle must have three equal sides.");
  }

  @Override
  public String toString() {
    return type;
  }
}