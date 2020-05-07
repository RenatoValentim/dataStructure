package aulaBase.aula8;

import aulaBase.MyArray;

/**
 * Remove
 */
public class Remove {

  public static void main(String[] args) {
    MyArray array = new MyArray(3);
    array.myPush("A");
    array.myPush("B");
    array.myPush("C");
    array.myPush("D");
    array.myPush("E");

    System.out.println(array);

    array.remove(array.size() - 1);
    System.out.println(array);

  }
}