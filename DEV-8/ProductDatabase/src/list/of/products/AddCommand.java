package list.of.products;

public class AddCommand implements Command {
  private DatabaseOperator operator;
  private Product product;

  public AddCommand(DatabaseOperator operator, Product product) {
    this.operator = operator;
    this.product = product;
  }

  public void execute() {
    operator.add(product);
  }
}
