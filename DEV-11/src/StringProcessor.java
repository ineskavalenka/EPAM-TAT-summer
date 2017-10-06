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

  /**
   * Transliterates a string assuming that language symbols can be more than one char length.
   *
   * @param input input string to transliterate
   * @param dictionaries an array of "dictionary"-hashmaps. dictionaries[N] is a dictionary with
   *                     N-char-length keys.
   * @param maxSymbolLength maximum symbol length of input language (in number of chars)
   * @return the transliterated string.
   */
  public String multipleSymbolTransliterate(String input, HashMap[] dictionaries, int
          maxSymbolLength) {
    //detectSymbolLength()
    //output+ (detect symbol)
    //i+=expectedSymbolLength;
    //return output
     return input;
  };

  /**
   * Detects the length of the next symbol in a string.
   * Since some longer symbols begin in the same way as shorter ones,
   * the method first assumes that a symbol has multiple chars. expectedSymbolLength parameter
   * indicates the biggest possible length. If there is no symbol with that length, the method
   * calls itself recursively with the expected length decreased.
   *
   * @param inputString the input string
   * @param i the index of first char of a symbol.
   * @param expectedSymbolLength expected symbol length.
   * @param dictionaries an array of "dictionary"-hashmaps. dictionaries[N] is a dictionary with
   *                     N-char-length keys.
   * @return the real symbol length, or 1 if the symbol cant be found in given dictionaries.
   */
  private int detectSymbolLength(String inputString, int i, int expectedSymbolLength,
          HashMap[] dictionaries){
    try {
      String symbol = inputString.substring(i,i+expectedSymbolLength);
      if (expectedSymbolLength==1) {
        //symbol not found =>(punctuation/space? can't translate)
        return 1;
      }
      if (dictionaries[expectedSymbolLength].containsKey(symbol)) {
        return expectedSymbolLength;
      }
      //if neither
      throw new IllegalArgumentException();
      //IllegalArg / ArrayOutOf
    } catch (Exception e){
        return detectSymbolLength(inputString, i, expectedSymbolLength-1,dictionaries );
    }
  }

  private String nextSymbol(String inputString, int i, int symbolLength,
          HashMap[] dictionaries) {
    String symbol = inputString.substring(i,i+symbolLength);
    return (String) dictionaries[symbolLength].get(symbol);
  }
}
