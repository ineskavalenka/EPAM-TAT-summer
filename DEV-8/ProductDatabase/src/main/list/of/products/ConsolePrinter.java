package main.list.of.products;

import java.util.Iterator;
import java.util.List;

/**
 * Prints to the console various stuff that commands need to print.
 */
public class ConsolePrinter {
  private final String SPACE = "        ";

  /**
   * Prints a single product info.
   * @param product the product to be displayed.
   */
  public void printSingleProduct(Product product) {
    System.out.print(product.getType() + SPACE);
    System.out.print(product.getName() + SPACE);
    System.out.print(product.getAmount() + SPACE);
    System.out.println(product.getPrice() + SPACE);
  }

  /**
   * Prints the average price of all products.
   * @param price the average price to be printed.
   */
  public void printAveragePrice(double price) {
    System.out.println("Average product price (all): " + price);
  }

  /**
   * Prints the average price of given type products.
   * @param price the average price to be printed.
   * @param type the type.
   */
  public void printAveragePrice(double price, String type) {
    System.out.println("Average product price (" + type + "): " + price + ".");
  }

  /**
   * Prints the total amount of products.
   * @param totalAmount total amount to be printed.
   */
  public void printCountAll(int totalAmount) {
    System.out.println("Total amount of products: " + totalAmount + " pcs.");
  }

  /**
   * Prints the number of product types.
   * @param numberOfTypes number of types to be printed.
   */
  public void printNumberOfTypes(int numberOfTypes) {
    System.out.println(numberOfTypes + " types of products available.");
  }

  /**
   * Prints all products from the given list.
   * @param productList a list of products to be printed.
   */
  public void printProductList(List productList) {
    Iterator iterator = productList.iterator();
    while(iterator.hasNext()) {
      Product product = (Product)iterator.next();
      printSingleProduct(product);
    }
  }

  /**
   * Prints all available commands with description.
   */
  public void  printHelpInfo() {
     System.out.println("List of commands.\n");
     System.out.println("add <type> <name> <amount> <price>"+ SPACE + "adds the product with \n" +
             "given characteristics to the database. <type> and <name> characteristics must be \n" +
             "single words without spaces. <amount> is a positive integer, \n<price> (of one piece)" +
             "is a positive not-integer.");
     System.out.println("print all"+ SPACE + "prints all available products.");
     System.out.println("count types"+ SPACE +"displays the number of product types.");
     System.out.println("count all"+ SPACE + "displays the total amount of products.");
     System.out.println("average price"+ SPACE + "displays the average product price (all " +
             "products)");
     System.out.println("average price <type>"+ SPACE + "displays the average price of the \n" +
             "products of given type.");
     System.out.println("exit"+ SPACE + "to exit.");
     System.out.println("help"+ SPACE + "for this reference.");
   }
/*
  public void printAllProducts(String type){
    ConsolePrinter consolePrinter = new ConsolePrinter();
    filterProducts(productList, hasType(type)).forEach(product -> consolePrinter
            .printSingleProduct((Product)product));
  }
  */
}
