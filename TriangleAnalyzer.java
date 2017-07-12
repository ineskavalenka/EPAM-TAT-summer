import java.math.BigDecimal;

/**
 * Analyzes triangles.
 * For analysis simplicity it is assumed that the sides of the input triangles
 * are sorted by nondecreasing.
 */
class TriangleAnalyzer {
  private BigDecimal sideA;
  private BigDecimal sideB;
  private BigDecimal sideC;
  
  public TriangleAnalyzer(Triangle triangle) {
    double[] sides = triangle.getSides();
    sideA = new BigDecimal(sides[0]);
    sideB = new BigDecimal(sides[1]);
    sideC = new BigDecimal(sides[2]);  
  } 
  
  /**
   * Checks, if the triangle is equilateral.
   * 
   * @return true if yes, false if no.
   */
  public boolean checkIfEquilateral() {
    // we can do this because sideA <= sideB <= sideC
    if (sideA.equals(sideC)) {
      return true;
    }
    return false;
  }
  
  /**
   * Checks, if the triangle is isolesces.
   * 
   * @return true if yes, false if no.
   */
  public boolean checkIfIsosceles() {
    if (sideA.equals(sideB) || sideA.equals(sideC) || sideB.equals(sideC)) {
      return true;
    }
    return false;
  }

  /**
   * Checks, if the triangle is scalene.
   * 
   * @return true if yes, false if no.
   */ 
  public boolean checkIfScalene() {
    if (!checkIfIsosceles() && !checkIfRight()) {
      return true;
    } 
    return false;
  }

  /**
   * Checks, if the triangle is right.
   * 
   * @return true if yes, false if no.
   */  
  public boolean checkIfRight() {
    // we can do this because sideA <= sideB <= sideC
    if (sideA.pow(2).add(sideB.pow(2)).equals(sideC.pow(2))) {
      return true;
    }
  return false;
  }
}
