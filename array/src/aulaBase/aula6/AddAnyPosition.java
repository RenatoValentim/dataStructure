package aulaBase.aula6;

import aulaBase.MyArray;

/**
 * AddAnyPosition
 */
public class AddAnyPosition {

  public static void main(String[] args) {
   
    MyArray array = new MyArray(10);
    array.myPush("B");
    array.myPush("C");
    array.myPush("E");
    array.myPush("F");
    array.myPush("G");
    System.out.println(array);

    array.myPush(0, "A");
    System.out.println(array);

    array.myPush(3, "D");
    System.out.println(array);

  }
}