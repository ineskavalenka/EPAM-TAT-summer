package list.of.products;

public class ProductBuilder {
  public Product build(String type, String name, int amount, double price){
    return new Product(type,name,amount,price);
  }
}
