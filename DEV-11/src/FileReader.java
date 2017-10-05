import java.io.*;
import java.util.HashMap;

/**
 * Performs file reading operations.
 */
public class FileReader {
  /**
   * Makes a dictionary HashMap from a dictionary text file.
   *
   * @param filename file name.
   * @return the dictionary HashMap.
   * @throws IOException if there is no such file.
   */
  public HashMap makeDictionary(String filename) throws IOException {
    HashMap dictionary = new HashMap();
    FileInputStream fileInputStream = new FileInputStream(filename);
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
    String line;
    while ((line = bufferedReader.readLine()) != null)   {
      //to do: catch: incorrect input line
      String[] parts = line.split("-");
      dictionary.put(parts[0], parts[1]);
    }
    return dictionary;
  }
}
