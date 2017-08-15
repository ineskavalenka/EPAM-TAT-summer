package list.of.products;

import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

import static list.of.products.ProductPredicates.*;

//Concrete Command
public class AveragePriceCommand implements Command {
  private DatabaseOperator operator;

  public AveragePriceCommand(DatabaseOperator operator) {
    this.operator = operator;
  }

  public void execute() {
    double averagePrice = operator.averagePrice();
    ConsolePrinter printer = new ConsolePrinter();
    printer.printAveragePrice(averagePrice);
  }
}