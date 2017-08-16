package list.of.products;

import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

public class PrintAllProductsCommand implements Command{
  private DatabaseOperator operator;

  public PrintAllProductsCommand(DatabaseOperator operator){
    this.operator = operator;
  }

  @Override
  public void execute() {
    List productList = operator.getProductList();
    ConsolePrinter printer = new ConsolePrinter();
    printer.printProductList(productList);
  }
}
