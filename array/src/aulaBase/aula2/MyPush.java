package aulaBase.aula2;

import aulaBase.MyArray;

/**
 * Run in debug mode to verify the method
 * myPush adding elements
 */
public class MyPush {

  public static void main(String[] args) {
    
    MyArray array = new MyArray(5);
    array.myPush("element 1");
    array.myPush("element 2");
    array.myPush("element 3");
    array.myPush("element 4");
    array.myPush("element 5");
  }
}