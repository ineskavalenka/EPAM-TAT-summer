package main.list.of.products;

/**
 * Adds the product to the database.
 */
public class AddCommand implements Command {
  private DatabaseOperator operator;
  private Product product;

  public AddCommand(DatabaseOperator operator, Product product) {
    this.operator = operator;
    this.product = product;
  }

  @Override
  public void execute() {
    operator.add(product);
  }
}
