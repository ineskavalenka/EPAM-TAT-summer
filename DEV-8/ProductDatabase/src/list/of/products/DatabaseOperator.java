package list.of.products;

import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

//Receiver
public class DatabaseOperator {
  Database database;

  public DatabaseOperator(Database database) {
    this.database = database;
  }

  public void add(Product product) {
    database.add(product);
  }

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

  public List getProductList() {
    return database.getProductList();
  }
}
