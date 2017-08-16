package list.of.products;

import java.util.List;
import java.util.LinkedList;
import static list.of.products.ProductPredicates.*;

/**
 * Stores the list of products and gives full or partial access to it.
 */
public class Database {
  List productList = new LinkedList();

  public Database() {
  }

  /**
   * Adds the product to the database.
   * @param newProduct
   * @throws
   */
  public void add(Product newProduct)
  {
    productList.add(newProduct);
  }

  /**
   * Gives a list of products only of a given type.
   * @param type
   * @return
   * @throws
   */
  public List getFilteredProductList(String type) {
    return filterProducts(productList, hasType(type));
  }

  /**
   * Gives a full product list.
   * @return
   * @throws
   */
  public List getProductList() {
    return productList;
  }
}