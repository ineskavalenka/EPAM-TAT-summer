package test;
import main.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ArrayTest {
  @Test
  public void addOneElementToEmptyArray() {
    ArrayList arrayList = new ArrayList();
    arrayList.add(6);
    assertEquals(6, arrayList.getElement(0));
    assertEquals(1, arrayList.length());
  }

  /*
  TO DO

  constructor(array);
  getElement
    correctindex,
    index < 0,
    index > size,
    index = size
  add
    add one elem to empty array
      to not empty  array
    add array to empty array
      to not empty  array

  insert(int element, int index):
      index < 0
      very beginning
      middle
      close to the end
      arraylist.length()
      > arraylist.length()

  insert(int[] array, int index):
      index < 0
      very beginning
      middle
      close to the end
      arraylist.length()
      > arraylist.length()

  when memory allocates
    1) add to empty < INIT_LENGTH - no allocation
    2) add > INIT_LENGTH

  remove(int index)
    correctindex,
    index < 0,
    index > size,
    index = size

  remove(int numberOfElements, int index)
    index < 0,
    index > size,
    index = size
  correctindex,
      correct numberOfElem
      munberOfElem = size
      munberOfElem > size
      if index close to the end of array => some of elem may be out of bounds
        same index, different numberOfElem (insertion.last = arraylist.length(), <, >)
   */
}