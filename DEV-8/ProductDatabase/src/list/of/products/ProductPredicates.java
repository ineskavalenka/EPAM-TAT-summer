package list.of.products;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProductPredicates {
  public static Predicate<Product> hasType(String expectedType) {
    return product -> product.getType().equalsIgnoreCase(expectedType);
  }

  public static List<Product> filterProducts (List<Product> products, Predicate<Product>
          predicate) {
    return products.stream().filter( predicate ).collect(Collectors.<Product>toList());
  }
}
