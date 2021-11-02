package com.javarush.test.level12.lesson12.home04;

/* Что это? «Кот», «Тигр», «Лев», «Бык», «хз»
Напиши метод, который определяет, какой объект передали в него.
Программа должна выводить на экран одну из надписей:
«Кот», «Тигр», «Лев», «Бык», «хз».
*/

class Solution {

  public static void main(String[] args) {
    System.out.println(getObjectType(new Cat()));
    System.out.println(getObjectType(new Tiger()));
    System.out.println(getObjectType(new Lion()));
    System.out.println(getObjectType(new Bull()));
    System.out.println(getObjectType(new Pig()));
  }

  private static String getObjectType(Object o) {
    // напишите код здесь:



  }

  static class Cat {

  }

  private static class Tiger {

  }

  private static class Lion {

  }

  private static class Bull {

  }

  private static class Pig {

  }
}
