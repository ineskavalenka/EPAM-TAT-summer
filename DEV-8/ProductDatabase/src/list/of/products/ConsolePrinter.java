package list.of.products;

public class ConsolePrinter {
  private final String SPACE = "  ";
  public void printSingleProduct(Product product) {
    System.out.print(product.getType() + SPACE);
    System.out.print(product.getName() + SPACE);
    System.out.print(product.getAmount() + SPACE);
    System.out.println(product.getPrice() + SPACE);
  }
  /*
    database.printAllProducts();
    System.out.println("TOTAL " + database.countAll() + " PRODUCTS.");
    System.out.println("Average price: " + database.averagePrice());
    System.out.println(database.countTypes()+" types of products.");
    database.printAllProducts("apple");
    System.out.println("Average price(apples): " + database.averagePrice("apple"));
    */

  public void printAveragePrice(double price) {
    System.out.println("Average product price (all): " + price);
  }

  public void printAveragePrice(double price, String type) {
    System.out.println("Average product price (" + type + "): " + price + ".");
  }

  public void printCountAll(int totalAmount) {
    System.out.println("Total amount of products: " + totalAmount + " pcs.");
  }

  public void printNumberOfTypes(int numberOfTypes) {
    System.out.println(numberOfTypes + " types of products available.");
  }

/*
  public void printAllProducts(){
    Iterator iterator = productList.iterator();
    ConsolePrinter consolePrinter = new ConsolePrinter();
    while(iterator.hasNext()) {
      Product product = (Product)iterator.next();
      consolePrinter.printSingleProduct(product);
    }
  }

  public void printAllProducts(String type){
    ConsolePrinter consolePrinter = new ConsolePrinter();
    filterProducts(productList, hasType(type)).forEach(product -> consolePrinter
            .printSingleProduct((Product)product));
  }
  */
}
