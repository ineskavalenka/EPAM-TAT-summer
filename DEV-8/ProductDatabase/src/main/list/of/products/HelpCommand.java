package main.list.of.products;

/**
 * Displays help documentation.
 */
public class HelpCommand implements Command {
  public void HelpCommand(){
  }
  @Override
  public void execute() {
    ConsolePrinter printer = new ConsolePrinter();
    printer.printHelpInfo();
  }
}
