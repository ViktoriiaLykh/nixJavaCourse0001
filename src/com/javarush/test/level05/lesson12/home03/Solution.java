package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор.
Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12/*высота, см*/ /*длина хвоста, см */


class Solution {
    public static void main(String[] args) {
        Dog dogSpyke = new Dog("Spyke", 6, 17);
        Cat catTom = new Cat("Tom", 6, false);
        Mouse mouseJerry = new Mouse("Jerry", 2, 4);
    }
    public static class Dog {
        private String name;
        private int age;
        private int tailLength;

        public Dog(String name, int age, int tailLength) {
            this.name = name;
            this.age = age;
            this.tailLength = tailLength;
        }
    }

    public static class Cat {
        private String name;
        private int age;
        private boolean isHomeless;

        public Cat(String name, int age, boolean isHomeless) {
            this.name = name;
            this.age = age;
            this.isHomeless = isHomeless;
        }
    }

    public static class Mouse {
        private String name;
        private int age;
        private int familyMembers;

        public Mouse(String name, int age, int familyMembers) {
            this.name = name;
            this.age = age;
            this.familyMembers = familyMembers;
        }
    }


}
