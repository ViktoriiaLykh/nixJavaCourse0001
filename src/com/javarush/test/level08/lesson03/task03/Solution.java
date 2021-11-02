package com.javarush.test.level08.lesson03.task03;

/* Коллекция HashMap из котов
Есть класс Cat с полем имя (name, String).
Создать коллекцию HashMap<String, Cat>.
Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
Вывести результат на экран, каждый элемент с новой строки.
*/

class Solution {

  public static void main(String[] args) {
    // напишите код здесь:


  }

  static class Cat {

    final String name;

    Cat(String name) {
      this.name = name;
    }

    @Override
    public String toString() {
      return name != null ? name.toUpperCase() : null;
    }
  }
}
