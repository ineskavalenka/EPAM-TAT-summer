package test;

import main.list.of.products.Product;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

  @Test
  public void correctArgumentsConstructorTypeGetter() {
    Product product = new Product("apple", "red_apple", 100, 1);
    assertEquals("apple", product.getType());
  }
/*
  @Test
  void exceptionTesting() {
    Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
      throw new IllegalArgumentException("a message");
    });
    assertEquals("a message", exception.getMessage());
  }*/

  @Test
  void exceptionTesting() {
    try {
      Product product = new Product("apple", "red_apple", 100, 1);
    } catch (Exception exception) {
      assertEquals("a message", exception.getMessage());
    }
  }
}
