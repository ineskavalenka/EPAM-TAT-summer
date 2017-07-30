public class ArrayList {
  final int INIT_LENGTH = 10;
  final int ADDITIONAL_MEMORY_LENGTH = 0;
  int[] array = new int[INIT_LENGTH];;
  int size = 0;

  public void ArrayList() {
    int[] array = new int[INIT_LENGTH];
    size = 0;
  }

  public int length() {
    return size;
  }

  private void validateIndexForAdding(int index) {
    if ((index>size)||(index<0)) {
      throw new ArrayIndexOutOfBoundsException();
    }
  }

  private void validateIndexForRemoving(int index) {
    if ((index>=size)||(index<0)) {
      throw new ArrayIndexOutOfBoundsException();
    }
  }

  private void validateNumberOfElementsForRemoving(int numberOfElements) {
    if ((numberOfElements>size)||(numberOfElements<=0)) {
      throw new IllegalArgumentException();
    }
  }

  private void validateRemoving(int numberOfElements, int index) {
    validateIndexForRemoving(index);
    validateNumberOfElementsForRemoving(numberOfElements);
    if(index + numberOfElements > size) {
      throw new ArrayIndexOutOfBoundsException();
    }
  }

  public int getElement(int index) throws ArrayIndexOutOfBoundsException {
    validateIndexForRemoving(index);
    return array[index];
  }

  public void add(int insertElement) {
    add(insertElement, size);
  }

  public void add(int insertElement, int insertIndex) throws ArrayIndexOutOfBoundsException {
    validateIndexForAdding(insertIndex);
    int[] temp = new int[1];
    temp[0] = insertElement;
    add(temp,insertIndex);
  }

  public void add(int[] insert, int insertIndex) throws ArrayIndexOutOfBoundsException {
    validateIndexForAdding(insertIndex);
    int memoryDifference = array.length - (size + insert.length);
    if (memoryDifference < 0) {
      AllocateMemory(memoryDifference);
    }
    for (int i = size-1; (i>=0); i--) {
      array[i + insert.length] = array[i];
    }
    for (int j = 0; j < insert.length; j++) {
      array[j + insertIndex] = insert[j];
    }
    size = size + insert.length;
  }

  private void AllocateMemory(int memoryDifference) {
    int newLength = calculateNewMemoryLength(memoryDifference);
    int[] newArray = new int[newLength];
    for (int i = 0; i < array.length; i++) {
      newArray[i] = array[i];
    }
    array = newArray;
  }

  private int calculateNewMemoryLength(int memoryDifference) {
    return (size + (- memoryDifference * 2) + ADDITIONAL_MEMORY_LENGTH);
  }

  public void remove(int numberOfElements, int removeIndex) throws
          ArrayIndexOutOfBoundsException, IllegalArgumentException {
    validateRemoving(numberOfElements, removeIndex);

    for (int j = 0; (j < numberOfElements)&&(j+removeIndex < size); j++) {
      array[j+removeIndex] = array[j + removeIndex + numberOfElements];
    }
    size = size - numberOfElements;
  }

  public void remove(int removeOnIndex) throws ArrayIndexOutOfBoundsException {
    remove(1, removeOnIndex);
  }
}
