package list.of.products;

/**
 * Prints the average product price (all products).
 */
public class AveragePriceCommand implements Command {
  private DatabaseOperator operator;

  public AveragePriceCommand(DatabaseOperator operator) {
    this.operator = operator;
  }

  @Override
  public void execute() {
    double averagePrice = operator.averagePrice();
    ConsolePrinter printer = new ConsolePrinter();
    printer.printAveragePrice(averagePrice);
  }
}