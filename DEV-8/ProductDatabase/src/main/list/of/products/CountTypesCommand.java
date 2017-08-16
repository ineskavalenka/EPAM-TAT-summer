package main.list.of.products;

/**
 * Prints the number of available product types.
 */
public class CountTypesCommand implements Command {
  private DatabaseOperator operator;

  public CountTypesCommand(DatabaseOperator operator){
    this.operator=operator;
  }

  @Override
  public void execute(){
    int numberOfTypes = operator.countTypes();
    ConsolePrinter printer = new ConsolePrinter();
    printer.printNumberOfTypes(numberOfTypes);
  }
}
