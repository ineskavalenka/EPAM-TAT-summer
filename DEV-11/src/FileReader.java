import java.io.*;
import java.util.HashMap;

public class FileReader {
  public HashMap makeDictionary(String filename) throws FileNotFoundException,IOException {

    HashMap dictionary = new HashMap();

    FileInputStream fileInputStream = new FileInputStream(filename);
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));

    String line;

    while ((line = bufferedReader.readLine()) != null)   {
      //catch: incorrect input line
      String[] parts = line.split("-");
      dictionary.put(parts[0], parts[1]);
    }
    return dictionary;
  }
}
