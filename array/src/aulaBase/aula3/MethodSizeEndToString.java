package aulaBase.aula3;

import aulaBase.MyArray;

/**
 * SizeMethod
 */
public class MethodSizeEndToString {

  public static void main(String[] args) {
    MyArray array = new MyArray(10);
    array.myPush("element 1");
    array.myPush("element 2");
    array.myPush("element 3");

    System.out.println(array.size());
    System.out.println(array.toString());
  }
}