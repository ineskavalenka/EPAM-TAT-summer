package list.of.products;

public class CountTypesCommand implements Command {
  private DatabaseOperator operator;

  public CountTypesCommand(DatabaseOperator operator){
    this.operator=operator;
  }

  public void execute(){
    int numberOfTypes = operator.countTypes();
    ConsolePrinter printer = new ConsolePrinter();
    printer.printNumberOfTypes(numberOfTypes);
  }
}
