package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

class Dog {
  private String name;
  private int height;
  private String color;

  public void initialize(String name) {
    initialize(name, 0,null);
  }

  public void initialize(String name, int height) {
    initialize(name, height, null);
  }

  public void initialize(String name, int height, String color) {
    this.name = name;
    this.height = height;
    this.color = color;
  }

}
