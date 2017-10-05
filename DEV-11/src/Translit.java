import java.io.*;
import java.util.HashMap;
public class Translit {

  public static void main(String[] args) {
    // Create a hash map
    HashMap ru_en = new HashMap();

    // Put elements to the map
    ru_en.put("Зара", "Zara");
    ru_en.put("Mahnaz", "Махназ");
    ru_en.put("Ayan", new Double(1378.00));
    ru_en.put("Daisy", new Double(99.22));
    ru_en.put("Qadir", new Double(-19.08));


    String key = "Mahnaz";
    if (ru_en.containsKey(key)) {
      System.out.println(ru_en.get(key));
    } else {
      System.out.println("no such key");
    }

    // catch: file not found
    FileInputStream fstream = null;
    try {
      fstream = new FileInputStream("textfile.txt");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

    String strLine;

    try {
      while ((strLine = br.readLine()) != null)   {
        // Print the content on the console
        //catch: incorrect input line
        String[] parts = strLine.split("-");
        System.out.println (parts[0] + " turns into " + parts[1]);

      }
    br.close();
    } catch (IOException e) {
      e.printStackTrace();
    }







  }
}
