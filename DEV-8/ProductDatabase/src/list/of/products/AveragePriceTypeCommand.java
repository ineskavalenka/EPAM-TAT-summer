package list.of.products;

public class AveragePriceTypeCommand implements Command {
  private DatabaseOperator operator;
  private String type;

  public AveragePriceTypeCommand(DatabaseOperator operator, String type) {
    this.operator = operator;
    this.type = type;
  }

  public void execute() {
    double averagePrice = operator.averagePrice(type);
    ConsolePrinter printer = new ConsolePrinter();
    printer.printAveragePrice(averagePrice, type);
  }
}