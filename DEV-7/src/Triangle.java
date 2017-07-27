import java.math.BigDecimal;

/**
 * Describes triangles with BigDecimal sides.
 */
class Triangle {
  final int NUMBER_OF_SIDES = 3;
  final String type = new String("regular");
  private BigDecimal[] sides = new BigDecimal[NUMBER_OF_SIDES];

  /**
   * Triangle constructor; makes a triangle from the sequence of its sides.
   *
   * @param sides a sequence of triangle sides.
   * @throws IllegalArgumentException if the triangle can't exist.
   */
  public Triangle(BigDecimal[] sides) {
    triangleExists(sides);
    this.sides = sides;
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
   * Determines the existence of a triangle with three given sides.
   *
   * @throws IllegalArgumentException if the triangle can't exist. The exception contains
   *                                  a message describing why the triangle can't exist.
   */
  public void triangleExists(BigDecimal[] sides) {
    if ((sides.length != NUMBER_OF_SIDES)) {
      throw new IllegalArgumentException("A triangle must have 3 sides.");
    }
    for (int i = 0; i < NUMBER_OF_SIDES; i++) {
      if (sides[i].compareTo(BigDecimal.ZERO) != 1) {
        throw new IllegalArgumentException("Triangle sides must be numbers.");
      }
    }
    if ((sides[0].add(sides[1]).subtract(sides[2]).compareTo(BigDecimal.ZERO) != 1) ||
        (sides[1].add(sides[2]).subtract(sides[0]).compareTo(BigDecimal.ZERO) != 1) ||
        (sides[0].add(sides[2]).subtract(sides[1]).compareTo(BigDecimal.ZERO) != 1)) {
      throw new IllegalArgumentException("Triangle can't exist: S<=0.");
    }
  }

  @Override
  public String toString() {
    return type;
  }
}