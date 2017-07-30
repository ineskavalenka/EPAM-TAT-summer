public class EntryPoint {
  public static void print(ArrayList arrayList) {
    for (int i = 0; i < arrayList.length(); i++) {
      System.out.print(arrayList.getElement(i) + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {

    try {
      ArrayList arrayList = new ArrayList();

      int addArray[] = new int[5];

      for (int i = 0; i < addArray.length; i++) {
        addArray[i] = i * 10 + 2;
      }

      arrayList.add(addArray, 0);
      print(arrayList);

      for (int i = 0; i < addArray.length; i++) {
        addArray[i] = i * 10 + 3;
      }

      arrayList.add(addArray, 3);
      print(arrayList);

      arrayList.add(4, 3);
      print(arrayList);

      arrayList.remove(4, 3);
      print(arrayList);

      arrayList.add(4, 7);
      print(arrayList);

      arrayList.remove(7);
      print(arrayList);

      arrayList.remove(4,0);
      print(arrayList);

    } catch (Exception e) {
      System.out.println("something went wrong :(");
    }
  }
}
