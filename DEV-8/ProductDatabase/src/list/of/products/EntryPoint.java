package list.of.products;

import java.util.LinkedList;
import java.util.List;

import static list.of.products.ProductPredicates.*;

/*
  count types - количество типов товаров;
	count all - общее количество товаров;
	average price - средняя стоимость товара;
	average price type - средняя стоимость товара каждого типа (тип задается пользователем), например average price pencil
  При получении команды exit программа должна завершиться
 */

public class EntryPoint {

  public static void main(String a[]) {

    Database database = new Database();
    DatabaseOperator operator = new DatabaseOperator(database);

   // Command add = new AddCommand(operator);
    Command countTypes = new CountTypesCommand(operator);
    Command countAll = new CountAllCommand(operator);
    Command averagePrice = new AveragePriceCommand(operator);


    ProductBuilder productBuilder = new ProductBuilder();

    operator.add(new Product("apple", "red apple", 100, 0.95));
    operator.add(new Product("peach", "sweet peach", 15, 1.25));
    operator.add(new Product("peach", "rotten peach", 10, 0.2));
    operator.add(new Product("apple", "green apple", 20, 1.2));
    operator.add(new Product("apple", "poisoned apple", 2, 99));
    operator.add(new Product("herb", "wormwood", 6, 20));

    countTypes.execute();
    countAll.execute();
    averagePrice.execute();
  }
}