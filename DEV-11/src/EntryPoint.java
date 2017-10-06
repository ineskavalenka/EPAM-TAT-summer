import java.util.HashMap;

/**
 * Converts a cyrillic string into a latin string, according to transliteration rules.
 */
public class EntryPoint {
  final static int MAX_SYMBOL_LENGTH_RU = 4;
  final static int MAX_SYMBOL_LENGTH_EN = 5;

  public static void main(String[] args) {
    FileReader fileReader = new FileReader();
    try {
      HashMap[] ruEn = new HashMap[MAX_SYMBOL_LENGTH_RU+1];
      for(int i=1; i<= MAX_SYMBOL_LENGTH_RU; i++) {
        ruEn[i] = fileReader.makeDictionary("ru_en_" + i + ".txt");
      }
      HashMap[] enRu = new HashMap[MAX_SYMBOL_LENGTH_EN+1];
      for(int i=1; i<= MAX_SYMBOL_LENGTH_EN; i++) {
        enRu[i] = fileReader.makeDictionary("en_ru_" + i + ".txt");
      }
      String inputRu = "Поешь еще этих свежих булок. БУЛКИ БУЛКИ ЁЁЁЁ!!!";
      System.out.println(inputRu);
      StringProcessor stringProcessor = new StringProcessor();
      System.out.println(stringProcessor.oneCharTransliterate(inputRu,ruEn[1]));
      String outputEn = stringProcessor.multipleCharTransliterate(inputRu, ruEn ,
              MAX_SYMBOL_LENGTH_RU);
      System.out.println(outputEn);
      String outputRu = stringProcessor.multipleCharTransliterate(outputEn, enRu ,
              MAX_SYMBOL_LENGTH_EN);
      System.out.println(outputRu);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
