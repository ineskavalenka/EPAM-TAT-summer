package list.of.products;

import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

//Receiver

/**
 * Works with the database; counts various database stuff.
 */
public class DatabaseOperator {
  Database database;

  /**
   *
   * @param database
   */
  public DatabaseOperator(Database database) {
    this.database = database;
  }

  /**
   * Adds the product to the database.
   * @param product
   */
  public void add(Product product) {
    database.add(product);
  }

  /**
   * Counts the number of product types.
   * @return
   */
  public int countTypes() {
    List productList = database.getProductList();
    Iterator iterator = productList.iterator();
    int typesCount = 0;
    List typesList = new LinkedList();
    while(iterator.hasNext()) {
      Product product = (Product)iterator.next();
      String type = product.getType();
      if(!typesList.contains(type)) {
        typesList.add(type);
        typesCount++;
      }
    }
    return typesCount;
  }

  /**
   * Counts the total amount of products.
   * @return
   */
  public int countAll() {
    List productList = database.getProductList();
    Iterator iterator = productList.iterator();
    int amountCount = 0;
    while(iterator.hasNext()) {
      Product product = (Product)iterator.next();
      amountCount = amountCount + product.getAmount();
    }
    return amountCount;
  }

  /**
   * Counts the average price of a product.
   * @return the average price.
   */
  public double averagePrice() {
    List productList = database.getProductList();
    Iterator iterator = productList.iterator();
    int amountCount = 0;
    double totalPriceCount = 0;
    while(iterator.hasNext()) {
      Product product = (Product)iterator.next();
      amountCount = amountCount + product.getAmount();
      totalPriceCount = totalPriceCount + product.getAmount()*product.getPrice();
    }
    return totalPriceCount/amountCount;
  }

  /**
   * Counts the average price of products of given type.
   * @param type
   * @return the average price of a type.
   */
  public double averagePrice(String type) {
    List filteredProductList = database.getFilteredProductList(type);
    int amountCount = 0;
    double totalPriceCount = 0;
    Iterator iterator = filteredProductList.iterator();
    while(iterator.hasNext()) {
      Product product = (Product)iterator.next();
      amountCount = amountCount + product.getAmount();
      totalPriceCount = totalPriceCount + product.getAmount()*product.getPrice();
    }
    return totalPriceCount/amountCount;
  }

  /**
   * Gets the product list from the database.
   * @return
   */
  public List getProductList() {
    return database.getProductList();
  }
}
