package com.javarush.test.level05.lesson05.task02;

/* Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/

public class Cat {

  public String name;
  public int age;
  public int strength;
  public int weight;

  public Cat() {
  }

  public boolean fight(Cat anotherCat) {
    int thisCatPower = calculatePower(this);
    int anotherCatPower = calculatePower(anotherCat);

    return thisCatPower > anotherCatPower;
  }
  private static int calculatePower(Cat cat) {
    int power;
    power =  cat.strength * 3 + cat.weight * 2;
    if (cat.age > 2 && cat.age < 6) {
     power += cat.age;
    }
    return power;
  }
}

