package aulaBase.aula5;

import aulaBase.MyArray;

/**
 * Check if an element exists in a array
 */
public class SequentialSearch {

  public static void main(String[] args) {
    MyArray array = new MyArray(3);
    array.myPush("element 1");
    array.myPush("element 2");
    array.myPush("element 3");

    System.out.println(array.find("element 1"));
  }
}