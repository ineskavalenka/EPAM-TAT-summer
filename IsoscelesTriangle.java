import java.math.BigDecimal;

class IsoscelesTriangle extends Triangle {
  double singleSide;
  double repeatingSide;
  
  public IsoscelesTriangle(double[] sides) {
    super(sides);
    if (!exists(sides)) {
      throw new IllegalArgumentException();
    }
    BigDecimal sideA = new BigDecimal(sides[0]);
    BigDecimal sideB = new BigDecimal(sides[1]);
    BigDecimal sideC = new BigDecimal(sides[2]);
    if (sideA.equals(sideB)) {
      singleSide = sides[2];
      repeatingSide = sides[0];
    }
    if (sideA.equals(sideC)) {
      singleSide = sides[1];
      repeatingSide = sides[0];
    }
    if (sideB.equals(sideC)) {
      singleSide = sides[0];
      repeatingSide = sides[1];
    }
  }
  
  public boolean exists(double[] sides) {
    if (!super.exists(sides)) {
      return false;
    }  
    BigDecimal sideA = new BigDecimal(sides[0]);
    BigDecimal sideB = new BigDecimal(sides[1]);
    BigDecimal sideC = new BigDecimal(sides[2]);
    if (sideA.equals(sideB) || sideA.equals(sideC) || sideB.equals(sideC)) {
      return true;
    }
    return false;    
  }
}
