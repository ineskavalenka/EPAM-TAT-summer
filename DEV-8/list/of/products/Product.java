package list.of.products;

/**
 * Describes products.
 */
public class Product {
  private String type;
  private String name;
  private int amount;
  private double price;

  /**
   * Constructor.
   * @param type the type of the product.
   * @param name the name of the product.
   * @param amount the amount of the product.
   * @param price the price of one product piece.
   * @throws
   */
  public Product(String type, String name, int amount, double price) {
    this.type = type;
    this.name = name;
    this.amount = amount;
    this.price = price;
  }

  /**
   * Type getter.
   * @return type.
   */
  public String getType() {
    return type;
  }

  /**
   * Name getter.
   * @return name.
   */
  public String getName() {
    return name;
  }

  /**
   * Amount getter.
   * @return amount.
   */
  public int getAmount() {
    return amount;
  }

  /**
   * Price getter.
   * @return price.
   */
  public double getPrice() {
    return price;
  }
}
