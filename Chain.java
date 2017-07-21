import java.math.BigDecimal;

public interface Chain {
	public abstract void setNext(Chain nextInChain);
	public abstract void process(BigDecimal[] sides);
}
