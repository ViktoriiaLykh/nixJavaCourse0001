package com.javarush.test.level06.lesson05.task03;

/* 300 000 объектов Cat и Dog
Создать в цикле 300 000 объектов Cat и Dog. (
Java-машина должна начать уничтожать неиспользуемые, и метод finalize хоть раз да вызовется).
*/

class Solution {
  public static void main(String[] args) {
    // напишите код здесь:



  }
}

class Cat {

  @Override
  protected void finalize() throws Throwable {
    System.out.println("Cat destroyed");
  }
}

class Dog {

  @Override
  protected void finalize() throws Throwable {
     System.out.println("Dog destroyed");
  }
}