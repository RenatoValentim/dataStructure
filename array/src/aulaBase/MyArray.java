package aulaBase;

/**
 * Array
 */
public class MyArray {

  private String[] elements;
  private int size;

  public MyArray(int capacity) {
    this.elements = new String[capacity];
    this.size = 0;
  }

/**
 * Add a new element in the first free position found
 * 
  public void myPush(String element) {
    for(int i = 0; i < this.elements.length; i++) {
      if(this.elements[i] == null) {
        this.elements[i] = element;
        break; // Stop the interarion as soo as condition is met
      }
    }
  } */

  /**
   * Optimizing the myPush funtion 1
   *    
  public void myPush(String element) throws Exception {
    if (this.size < this.elements.length) {
      this.elements[this.size] = element;
      this.size++;
    } else {
      throw new Exception("No array space");
    }
  } */

  /**
   * Optimizing the myPush funtion 2
   */
  public boolean myPush(String element) {
    this.increasesCapacity();
    if (this.size < this.elements.length) {
      this.elements[this.size] = element;
      this.size++;
      return true;
    }
    return false;
  }

  public void remove(int position) {
    validatesPosition(position);
    for(int i = position; i < this.size - 1; i++) {
      this.elements[i] = this.elements[i + 1];
    }
    this.size--;
  }

  public boolean myPush(int position, String element) {
    validatesPosition(position);

    for(int i = this.size - 1; i >= position; i--) {
      this.elements[i + 1] = this.elements[i];
    }
    this.elements[position] = element;
    this.size++;

    return true;
  }

  private void increasesCapacity() {
    if (this.size == this.elements.length) {
      String[] newElements = new String[this.elements.length * 2];
      for(int i = 0; i < this.elements.length; i++) {
        newElements[i] = this.elements[i];
      }
      this.elements = newElements;
    }
  }

  private void validatesPosition(int position) {
    if (!(position >= 0 && position < this.size)) {
      throw new IllegalArgumentException("Invalid Position");
    }
  }

  public String find(int position) {
    validatesPosition(position);
    return this.elements[position];
  }

  public int find(String element) {
    for(int i = 0; i < this.size; i++) {
      if (this.elements[i].equals(element)) {
        return i;
      }
    }
    return -1;
  }

  public int size() {
    return this.size;
  }

  @Override
  public String toString() {
    StringBuilder myString = new StringBuilder();

    myString.append("[");
    for(int i = 0; i < this.size - 1; i++) {
      myString.append(this.elements[i]);
      myString.append(", ");
    }

    if (this.size > 0) {
      myString.append(this.elements[this.size - 1]);
    }
    myString.append("]");

    return myString.toString();
  }
}