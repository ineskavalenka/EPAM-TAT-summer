import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StringProcessor {

  public String transliterate(HashMap dictionary, String inputString){
    Set set = dictionary.entrySet();
    Iterator i = set.iterator();
    while(i.hasNext()) {
      Map.Entry symbol = (Map.Entry)i.next();
   //   System.out.print(symbol.getKey() + ": ");
   //   System.out.println(symbol.getValue());

      if (inputString.contains(symbol.getKey().toString())) {
        inputString.replace(symbol.getKey().toString(),symbol.getValue().toString());
      }

    }
    System.out.println();


    return inputString;
  }
}
