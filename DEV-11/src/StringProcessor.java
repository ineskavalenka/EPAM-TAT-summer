import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Performs transliteration operations on strings.
 */
public class StringProcessor {
  /**
   * Transliterates a russian string into latin-translit string,
   * using symbol-by-symbol logic.
   *
   * @param inputRu input russian string.
   * @param dictionary Ru-En dictionary.
   * @return transliterated in latin input string.
   */
  public String oneSymbolTransliterate(String inputRu, HashMap dictionary) {
    String output = "";
    for (int i = 0; i < inputRu.length(); i++) {
      String key = inputRu.substring(i, i + 1);
      if (dictionary.containsKey(key)) {
        output = output + dictionary.get(key);
      } else {
        output = output + key;
      }
    }
    return output;
  }
}
