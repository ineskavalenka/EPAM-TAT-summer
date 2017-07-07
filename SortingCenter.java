/**
 * A collection of sort methods.
 */
class SortingCenter {
  
  /**
   * Nondecreasing selection sort (output[0] is min).
   */
  public void selectionSort(double[] inputArray) {
    for (int i = 0; i < inputArray.length; i++) {
      int minCount = i; 
      double minElement = inputArray[i];
      for (int j = i+1; j < inputArray.length; j++) {
        if (inputArray[j] < minElement) {
           minElement = inputArray[j];
           minCount = j;
        }
      }
      if (i != minCount) {
        double temp = inputArray[i];
        inputArray[i] = inputArray[minCount];
        inputArray[minCount] = temp;
      }
    }
  }
}
