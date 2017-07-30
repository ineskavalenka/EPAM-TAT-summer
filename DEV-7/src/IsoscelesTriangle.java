import java.math.BigDecimal;

/**
 * Describes isosceles triangles.
 */
class IsoscelesTriangle extends Triangle {
  final String type = "isosceles";

  /**
   * IsoscelesTriangle constructor.
   *
   * @throws IllegalArgumentException if the triangle can't exist.
   */
  public IsoscelesTriangle(BigDecimal[] sides) {
    super(sides);
    exists(sides);
  }

  /**
   * Determines the existence of an isosceles triangle with given sides.
   *
   * @throws IllegalArgumentException if the triangle can't exist. The exception contains
   *                                  a message describing why the triangle can't exist.
   */
  public void exists(BigDecimal[] sides) {
    super.triangleExists(sides);
    if (!(sides[0].equals(sides[1]) || sides[0].equals(sides[2]) || sides[1].equals(sides[2]))) {
      throw new IllegalArgumentException("Isosceles triangle must have two equal sides.");
    }
  }

  @Override
  public String toString() {
    return type;
  }
}