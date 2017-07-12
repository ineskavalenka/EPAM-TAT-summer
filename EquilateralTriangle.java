import java.math.BigDecimal;

class EquilateralTriangle extends Triangle {
  double repeatingSide;
  
  public EquilateralTriangle(double[] sides) {
    super(sides);
    if (!exists(sides)) {
      throw new IllegalArgumentException();
    }
    repeatingSide = sides[0];
  }
  
  public boolean exists(double[] sides) {
    if (!super.exists(sides)) {
      return false;
    }  
    BigDecimal sideA = new BigDecimal(sides[0]);
    BigDecimal sideB = new BigDecimal(sides[1]);
    BigDecimal sideC = new BigDecimal(sides[2]);
    if (sideA.equals(sideB) && sideA.equals(sideC)) {
      return true;
    }
    return false;    
  }
}
