import java.io.*;
import java.util.HashMap;

/**
 * Converts a cyrillic string into a latin string, according to transliteration rules.
 */
public class EntryPoint {
  public static void main(String[] args) {
    FileReader fileReader = new FileReader();
    try {
      HashMap ru_en = fileReader.makeDictionary("ru_en_1.txt");
      String inputRu = "Поешь еще этих свежих булок. БУЛКИ БУЛКИ ЁЁЁЁ!!!";
      StringProcessor stringProcessor = new StringProcessor();
      System.out.println(stringProcessor.oneSymbolTransliterate(inputRu,ru_en));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
