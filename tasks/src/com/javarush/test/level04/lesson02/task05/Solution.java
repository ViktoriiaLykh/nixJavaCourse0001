package com.javarush.test.level04.lesson02.task05;

/* Подсчитать количество котов
Написать код, чтобы правильно считалось количество созданных котов (count) и на экран выдавалось правильно их количество.
*/

class Solution {

  public static void main(String[] args) {
    Cat cat1 = new Cat();

    Cat.count = Cat.count + 1;

    Cat cat2 = new Cat();

    Cat.count = Cat.count + 1;

    System.out.println("Cats count is " + Cat.count);
  }

  static class Cat {
    static int count = 0;
  }
}