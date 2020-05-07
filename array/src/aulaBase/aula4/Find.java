package aulaBase.aula4;

import aulaBase.MyArray;

/**
 * Get an element from a position
 */
public class Find {

  public static void main(String[] args) {
    MyArray array = new MyArray(3);
    array.myPush("element 1");
    array.myPush("element 2");
    array.myPush("element 3");

    System.out.println(array.find(2));
  }
}