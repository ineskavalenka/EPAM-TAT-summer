/**
 * Describes triangles with double sides.
 */
class Triangle {
  final int NUMBER_OF_SIDES = 3;
  private double[] sides = new double[NUMBER_OF_SIDES];
  
  /**
   * Triangle constructor; makes a triangle from the sequence of its sides.
   * Sides of the created triangle are sorted by nondecreasing, even if the input sequence is not.
   *
   * @param sidesSequence a sequence of triangle sides
   * @throws IllegalArgumentException if the sequence has not three sides.
   * @throws NumberFormatException if sides are not numbers.
   */
  public Triangle(double[] sides) {
    if (!exists(sides)) {
      throw new IllegalArgumentException();
    }       
  }
  
  /**
   * Triangle side getter.
   *
   * @return the sequence of this.sides.
   */
  public double[] getSides() {
    return sides;
  }
  
  public boolean exists(double[] sides) {
    if (sides.length != NUMBER_OF_SIDES) {
      return false;
    }
    for (int i = 0; i < NUMBER_OF_SIDES; i++) {
      if (sides[i] <= 0) {
        return false;
      }
    }
    if ((sides[0] + sides[1] - sides[2] <= 0) || (sides[1] + sides[2] - sides[0] <= 0) || 
    (sides[0] + sides[2] - sides[1] <= 0)) {
      return false;
    }
    return true;
  }
}
