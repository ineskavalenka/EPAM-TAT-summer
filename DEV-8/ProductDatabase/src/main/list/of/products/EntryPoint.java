package main.list.of.products;

import java.util.Scanner;

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

    operator.add(new Product("apple", "red apple", 100, 0.95));
    operator.add(new Product("peach", "sweet peach", 15, 1.25));
    operator.add(new Product("peach", "rotten peach", 10, 0.2));
    operator.add(new Product("apple", "green apple", 20, 1.2));
    operator.add(new Product("apple", "poisoned apple", 2, 99));
    operator.add(new Product("herb", "wormwood", 6, 20));

    Scanner inputScanner = new Scanner(System.in);
    System.out.println("Welcome!");

    // these are without arguments, same all the time, can be created once;
    // others are created with different arguments every time when executed.
    Command countTypes = new CountTypesCommand(operator);
    Command countAll = new CountAllCommand(operator);
    Command averagePrice = new AveragePriceCommand(operator);
    Command printAll = new PrintAllProductsCommand(operator);
    Command help = new HelpCommand();

    for(int i=0;i<10 ;i++) {
      String userRequest = inputScanner.nextLine().trim();
      if (userRequest.startsWith("add")) {
        String userRequestSplit[] = userRequest.split(" ");
        // first word is "add"
        String type = userRequestSplit[1];
        String name = userRequestSplit[2];
        int amount = Integer.parseInt(userRequestSplit[3]);
        double price = Double.parseDouble(userRequestSplit[4]);
        Command add = new AddCommand(operator, new Product(type, name, amount, price));
        add.execute();
      } else if (userRequest.equals("count types")) {
        countTypes.execute();
      } else if (userRequest.equals("count all")) {
        countAll.execute();
      } else if (userRequest.startsWith("average price")) {
        if (userRequest.length() == 13) {
          averagePrice.execute();
        } else {
          String type = userRequest.substring(14);
          Command averagePriceType = new AveragePriceTypeCommand(operator, type);
          averagePriceType.execute();
        }
      } else if (userRequest.equals("exit")) {
        System.out.println("Bye!");
        return;
      } else if (userRequest.equals("help")) {
        help.execute();
      } else if (userRequest.equals("print all")) {
        printAll.execute();
      } else {
        System.out.println("No such command. Try \"help\".");
      }
    }
  }
}