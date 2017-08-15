package list.of.products;

public class AddCommand {
  private DatabaseOperator operator;

  public AddCommand(DatabaseOperator operator) {
    this.operator = operator;
  }

  public void execute(Product product) {
    operator.add(product);
  }

  public void execute() {
  }
}
