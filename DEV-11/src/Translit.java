import java.io.*;
import java.util.HashMap;

public class Translit {

  public static void main(String[] args) {
    FileReader fileReader = new FileReader();

    try {
      HashMap ru_en = fileReader.makeDictionary("ru_en_1.txt");

      String inputRU = "Поешь еще этих свежих булок. БУЛКИ БУЛКИ ЁЁЁЁ!!!";

      StringProcessor stringProcessor = new StringProcessor();
      String outputEN = stringProcessor.transliterate(ru_en, inputRU);

      System.out.println(outputEN);

      for (int i = 0; i < inputRU.length(); i++) {
        String key = inputRU.substring(i, i + 1);
        if (ru_en.containsKey(key)) {
          System.out.print(ru_en.get(key));
        } else {
          System.out.print(key);
        }
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
