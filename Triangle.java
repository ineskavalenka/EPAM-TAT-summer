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
     
    SortingCenter sorter = new SortingCenter();
    sorter.selectionSort(sides);
  }
  
  /**
   * Triangle side getter.
   *
   * @return the sequence of this.sides.
   */
  public double[] getSides() {
    return sides;
  }
}
