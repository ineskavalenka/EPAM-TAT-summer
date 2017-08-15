package list.of.products;

public class Product {
  private String type;
  private String name;
  private int amount;
  private double price;

  public Product(String type, String name, int amount, double price) {
    this.type = type;
    this.name = name;
    this.amount = amount;
    this.price = price;
  }

  public String getType() {
    return type;
  }
  public String getName() {
    return name;
  }
  public int getAmount() {
    return amount;
  }
  public double getPrice() {
    return price;
  }
}
