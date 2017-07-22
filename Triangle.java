import java.math.BigDecimal;

/**
 * Describes triangles with BigDecimal sides.
 */
class Triangle {
  final int NUMBER_OF_SIDES = 3;
  String type = new String("regular");
  private BigDecimal[] sides = new BigDecimal[NUMBER_OF_SIDES];

  /**
   * Triangle constructor; makes a triangle from the sequence of its sides.
   *
   * @param sides a sequence of triangle sides
   * @throws NullPointerException if the triangle's square is <= 0 (triangle does not exist).
   * @throws IllegalArgumentException if the sequence has not three sides. 
   */
  public Triangle(BigDecimal[] sides) {
    if (!exists(sides)) {
      throw new NullPointerException();
    }   
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
   * @throws IllegalArgumentException if not three sides were given in the input sequence. 
   * @return true if the triangle exists,
   *         false if not.
   */
  public boolean exists(BigDecimal[] sides) {
    if ((sides.length != NUMBER_OF_SIDES)) {
      throw new IllegalArgumentException();
    }
    for (int i = 0; i < NUMBER_OF_SIDES; i++) {
      if (sides[i].compareTo(BigDecimal.ZERO) != 1) {
        return false;
      }
    }
    if ((sides[0].add(sides[1]).subtract(sides[2]).compareTo(BigDecimal.ZERO) != 1) ||
    (sides[1].add(sides[2]).subtract(sides[0]).compareTo(BigDecimal.ZERO) != 1) || 
    (sides[0].add(sides[2]).subtract(sides[1]).compareTo(BigDecimal.ZERO) != 1)) {
      return false;
    }
    return true;
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
