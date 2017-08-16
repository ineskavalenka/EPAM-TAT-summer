package main.list.of.products;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Database filtering logic.
 */
public class ProductPredicates {

  /**
   * Determines if the product has given type.
   * @param expectedType
   * @return true if has, false i not.
   */
  public static Predicate<Product> hasType(String expectedType) {
    return product -> product.getType().equalsIgnoreCase(expectedType);
  }

  /**
   * Filters the product list with a given predicate.
   * @param productList unfiltered list of products.
   * @param predicate that determines if the product passes the filter or not (yes, if predicate
   *                  (product)==true).
   * @return the filtered list.
   */
  public static List<Product> filterProducts (List<Product> productList, Predicate<Product>
          predicate) {
    return productList.stream().filter( predicate ).collect(Collectors.<Product>toList());
  }
}
