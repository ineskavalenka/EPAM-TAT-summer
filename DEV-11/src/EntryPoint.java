import java.io.*;
import java.util.HashMap;

/**
 * Converts a cyrillic string into a latin string, according to transliteration rules.
 */
public class EntryPoint {
  final static int MAX_SYMBOL_LENGTH_RU = 4;
  final static int MAX_SYMBOL_LENGTH_EN = 4;

  public static void main(String[] args) {
    FileReader fileReader = new FileReader();
    try {
      HashMap[] ruEn = new HashMap[MAX_SYMBOL_LENGTH_RU+1];
      for(int i=1; i<=MAX_SYMBOL_LENGTH_RU; i++) {
        ruEn[i] = fileReader.makeDictionary("ru_en_" + i + ".txt");
      }
      HashMap[] enRu = new HashMap[MAX_SYMBOL_LENGTH_RU+1];
      for(int i=1; i<=MAX_SYMBOL_LENGTH_EN; i++) {
        enRu[i] = fileReader.makeDictionary("en_ru_" + i + ".txt");
      }
      String inputRu = "Поешь еще этих свежих булок. БУЛКИ БУЛКИ ЁЁЁЁ!!!";
      StringProcessor stringProcessor = new StringProcessor();
      System.out.println(stringProcessor.oneSymbolTransliterate(inputRu,ruEn[1]));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
