import java.math.BigDecimal;

class EquilateralTriangle extends Triangle {
  double repeatingSide;
  
  public EquilateralTriangle(double[] sides) {
    if (!exists(sides)) {
      throw new IllegalArgumentException();
    }
      repeatingSide = sides[0];
  }
  
  public boolean exists(double[] sides) {
    if (!super.exists(sides)) {
      return false;
    }  
    sideA = new BigDecimal(sides[0]);
    sideB = new BigDecimal(sides[1]);
    sideC = new BigDecimal(sides[2]);
    if (sideA.equals(sideB) && sideA.equals(sideC)) {
      return true;
    }
    return false;    
  }
}
