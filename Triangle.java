import java.math.BigDecimal;

/**
 * Describes triangles with double sides.
 */
class Triangle {
  //final BigDecimal ZERO = new BigDecimal(0);
  //final BigDecimal ONE = new BigDecimal(1);
  final int NUMBER_OF_SIDES = 3;
  String type = new String("regular");
  //private double[] sides = new double[NUMBER_OF_SIDES];
  private BigDecimal[] sides = new BigDecimal[NUMBER_OF_SIDES];
  /**
   * Triangle constructor; makes a triangle from the sequence of its sides.
   *
   * @param sides a sequence of triangle sides
   * @throws IllegalArgumentException if the sequence has not three sides.
   */
  public Triangle(BigDecimal[] sides) {
    System.out.println("Triangle constructor");
    System.out.println(sides[0]);
    System.out.println(sides[1]);
    System.out.println(sides[2]);
  
    if (!exists(sides)) {
      throw new IllegalArgumentException();
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
   * Determines the existence of a triangle with given sides.
   *
   * @return true if the triangle exists,
   *         false if not.
   */
  public boolean exists(BigDecimal[] sides) {
    System.out.println("Triangle.exists?");
    if (sides.length != NUMBER_OF_SIDES) {
      return false;
    }
    for (int i = 0; i < NUMBER_OF_SIDES; i++) {
      if (sides[i].compareTo(BigDecimal.ZERO) != 1) {
        System.out.println("Triangle.exists caught zero side");
        return false;
      }
    }
    if ((sides[0].add(sides[1]).subtract(sides[2]).compareTo(BigDecimal.ZERO) != 1) ||
    (sides[1].add(sides[2]).subtract(sides[0]).compareTo(BigDecimal.ZERO) != 1) || 
    (sides[0].add(sides[2]).subtract(sides[1]).compareTo(BigDecimal.ZERO) != 1)) {
      System.out.println("Triangle.exists: sum of two sides less than third side");
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
