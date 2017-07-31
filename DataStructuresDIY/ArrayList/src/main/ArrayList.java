package main;

public class ArrayList {
  final int INIT_LENGTH = 10;
  final int ADDITIONAL_MEMORY_LENGTH = 0;
  int[] array = new int[INIT_LENGTH];

  int dataSize = 0;

  /**
   * ArrayList constructor.
   * Initializes an empty array.
   */
  public void ArrayList() {
    int[] array = new int[INIT_LENGTH];
    dataSize = 0;
  }

  /**
   * ArrayList constructor.
-  * Initializes an array that has the same elements as the argument.
   *
   * @param initArray initialization array.
   */
  public void ArrayList(int[] initArray) {
    int[] array = new int[initArray.length];
    dataSize = initArray.length;
  }

  /**
   * ArrayList length getter.
   *
   * @return array length.
   */
  public int length() {
    return dataSize;
  }

  //to do: element setter.

  /**
   * Element getter.
   *
   * @param index of the requested element.
   * @return value of the requested element.
   * @throws ArrayIndexOutOfBoundsException if the element doesn't exist.
   */
  public int getElement(int index) throws ArrayIndexOutOfBoundsException {
    if ((index >= dataSize) || (index < 0)) {
      throw new ArrayIndexOutOfBoundsException();
    }
    return array[index];
  }

  /**
   * Adds an element to the end of the array.
   *
   * @param element the element to be added.
   */
  public void add(int element) {
    int memoryDifference = array.length - (dataSize + 1);
    if (memoryDifference < 0) {
      allocateMemory(memoryDifference);
    }
    array[dataSize] = element;
    dataSize = dataSize + 1;
  }

  /**
   * Inserts an element in the array at the index position.
   *
   * @param element the element to be inserted.
   * @param index indicates the insertion position.
   * @throws ArrayIndexOutOfBoundsException
   */
  public void insert(int element, int index) throws ArrayIndexOutOfBoundsException {
    if ((index > dataSize) || (index < 0)) {
      throw new ArrayIndexOutOfBoundsException();
    }
    int memoryDifference = array.length - (dataSize + 1);
    if (memoryDifference < 0) {
      allocateMemory(memoryDifference);
    }
    for (int i = dataSize - 1; i >= 0; i--) {
      array[i + 1] = array[i];
    }
      array[index] = element;
    dataSize = dataSize + 1;
  }

  /**
   * Inserts a number of elements in the array at the index position.
   *
   * @param insertArray array of elements to be inserted.
   * @param index indicates the insertion position.
   * @throws ArrayIndexOutOfBoundsException
   */
  public void insert(int[] insertArray, int index) throws ArrayIndexOutOfBoundsException {
    if ((index > dataSize) || (index < 0)) {
      throw new ArrayIndexOutOfBoundsException();
    }
    int memoryDifference = array.length - (dataSize + insertArray.length);
    if (memoryDifference < 0) {
      allocateMemory(memoryDifference);
    }
    for (int i = dataSize - 1; i >= 0; i--) {
      array[i + insertArray.length] = array[i];
    }
    for (int j = 0; j < insertArray.length; j++) {
      array[j + index] = insertArray[j];
    }
    dataSize = dataSize + insertArray.length;
  }

  /**
   * Allocates extra memory for the array.
   *
   * @param memoryDifference the difference between currently allocated memory and the memory
   *                         amount the program needs for further processing. Since this method
   *                         is designed for being called when the program is out of memory,
   *                         memoryDifference parameter is expected to be less than zero.
   */
  private void allocateMemory(int memoryDifference) {
    int newLength = calculateNewMemoryLength(memoryDifference);
    int[] newArray = new int[newLength];
    for (int i = 0; i < array.length; i++) {
      newArray[i] = array[i];
    }
    array = newArray;
  }

  /**
   * Calculates the memory amount the program needs for the further array processing.
   *
   * @param memoryDifference the difference between currently allocated memory and the memory
   *                         amount the program needs for further processing. Since this method
   *                         is designed for being called when the program is out of memory,
   *                         memoryDifference parameter is expected to be less than zero.
   * @return the calculated length of memory.
   */
  private int calculateNewMemoryLength(int memoryDifference) {
    return (dataSize + (-memoryDifference * 2) + ADDITIONAL_MEMORY_LENGTH);
  }

  /**
   * Removes a number of elements starting from the index position.
   *
   * @param numberOfElements a number of elements to be removed.
   * @param index indicates the removal position.
   * @throws ArrayIndexOutOfBoundsException
   * @throws IllegalArgumentException
   */
  public void remove(int numberOfElements, int index) throws
          ArrayIndexOutOfBoundsException, IllegalArgumentException {
    if ((index >= dataSize) || (index < 0)) {
      throw new ArrayIndexOutOfBoundsException();
    }
    if ((numberOfElements > dataSize) || (numberOfElements <= 0)) {
      throw new IllegalArgumentException();
    }
    if (index + numberOfElements > dataSize) {
      throw new ArrayIndexOutOfBoundsException();
    }
    for (int j = 0; (j < numberOfElements) && (j + index < dataSize); j++) {
      array[j + index] = array[j + index + numberOfElements];
    }
    dataSize = dataSize - numberOfElements;
  }

  /**
   * Removes the element at index position.
   *
   * @param index indicates the removal position.
   * @throws ArrayIndexOutOfBoundsException
   */
  public void remove(int index) throws ArrayIndexOutOfBoundsException {
    if ((index >= dataSize) || (index < 0)) {
      throw new ArrayIndexOutOfBoundsException();
    }
    if (dataSize == 0) {
      throw new IllegalArgumentException();
    }
    for (int j = index; j < dataSize; j++) {
      array[j] = array[j + 1];
    }
    dataSize = dataSize - 1;
  }
}
