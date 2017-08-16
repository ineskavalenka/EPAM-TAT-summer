package list.of.products;

/**
 * Prints the total amount of products.
 */
public class CountAllCommand implements Command {
  private DatabaseOperator operator;

  public CountAllCommand(DatabaseOperator operator){
    this.operator = operator;
  }

  @Override
  public void execute() {
    int totalAmount = operator.countAll();
    ConsolePrinter printer = new ConsolePrinter();
    printer.printCountAll(totalAmount);
  }
}
