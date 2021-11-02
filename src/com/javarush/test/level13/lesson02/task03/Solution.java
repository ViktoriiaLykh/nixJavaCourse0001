package com.javarush.test.level13.lesson02.task03;

/* Пиво и кола
Реализуй интерфейс Drink в классах Beer и Cola.
*/

public class Solution {

  public static void main(String[] args) {

    // uncomment following 2 rows
    print(new Beer());
    print(new Cola());

  }

  private static void print(Drink drink) {
    System.out.println(drink.getClass().getSimpleName());
  }

  interface Drink {

    boolean isAlcoholic();
  }

  public static class Beer {
    // напишите код здесь:

  }

  public static class Cola {
    // напишите код здесь:

  }
}
