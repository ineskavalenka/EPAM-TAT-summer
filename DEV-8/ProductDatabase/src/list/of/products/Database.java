package list.of.products;

import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;
import static list.of.products.ProductPredicates.*;

public class Database {
  List productList = new LinkedList();

  public Database() {
  }

  public Database(List list) {
    this.productList = new LinkedList (list);
  }

  public void add(Product newProduct)
  {
    productList.add(newProduct);
  }

  public List getFilteredProductList(String type) {
    return filterProducts(productList, hasType(type));
  }

  public List getProductList() {
    return productList;
  }

}