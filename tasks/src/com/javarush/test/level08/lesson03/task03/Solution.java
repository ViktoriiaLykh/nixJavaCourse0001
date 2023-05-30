package com.javarush.test.level08.lesson03.task03;

/* Коллекция HashMap из котов
Есть класс Cat с полем имя (name, String).
Создать коллекцию HashMap<String, Cat>.
Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
Вывести результат на экран, каждый элемент с новой строки.
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Solution {

  public static void main(String[] args) {
    HashMap<String, Cat> cats = new HashMap<>();
    cats.put("Макс", new Cat("Макс"));
    cats.put("Белла", new Cat("Белла"));
    cats.put("Чарли", new Cat("Чарли"));
    cats.put("Луи", new Cat("Луи"));
    cats.put("Симба", new Cat("Симба"));
    cats.put("Китти", new Cat("Китти"));
    cats.put("Мистер Мур", new Cat("Мистер Мур"));
    cats.put("Арчи", new Cat("Арчи"));
    cats.put("Миттенс", new Cat("Миттенс"));
    cats.put("Гизмо", new Cat("Гизмо"));

    for (Map.Entry<String, Cat> pair : cats.entrySet()) {
      String key = pair.getKey();
      Cat value = pair.getValue();
      System.out.println(key + " " + value);
    }


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
