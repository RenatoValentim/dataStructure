package aulaBase.aula7;

import aulaBase.MyArray;

/**
 * IncreasesCapacity
 */
public class IncreasesCapacity {

  public static void main(String[] args) {
    MyArray array = new MyArray(3);
    array.myPush("A");
    array.myPush("B");
    array.myPush("C");
    array.myPush("D");
    array.myPush("E");

    System.out.println(array);
  }
}