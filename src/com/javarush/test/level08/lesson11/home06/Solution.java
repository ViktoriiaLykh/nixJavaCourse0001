package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

class Solution {
    public static void main(String[] args) {
        Human child1 = new Human("Сева", true, 12);
        Human child2 = new Human("Карина", false, 8);
        Human child3 = new Human("Вика", false, 1);

        ArrayList<Human> children = new ArrayList<>();
        children.add(child1);
        children.add(child2);
        children.add(child3);

        Human father = new Human("Антон", true, 31, children);
        Human mother = new Human("Арина", false, 29, children);

        ArrayList<Human> parents = new ArrayList<>();
        parents.add(mother);
        parents.add(father);

        Human grandFather = new Human("Аркадий", true, 55, parents);
        Human grandFather2 = new Human("Инокентий", true, 66, parents);
        Human grandMother = new Human("Анна", false, 52, parents);
        Human grandMother2 = new Human("Кристина", false, 61, parents);

        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(grandFather);
        System.out.println(grandFather2);
        System.out.println(grandMother);
        System.out.println(grandMother2);
    }

    public static class Human {

       private String name;
       private boolean gender;
       private int age;
       private ArrayList<Human> children;

        public Human(String name, boolean gender, int age) {
            this.name = name;
            this.gender = gender;
            this.age = age;
            this.children = new ArrayList<>();
        }

        public Human(String name, boolean gender, int age, ArrayList<Human> children) {
            this.name = name;
            this.gender = gender;
            this.age = age;
            this.children = children;
        }

        @Override
        public String toString() {
            String gen = gender ? "мужской" : "женский";
            return "Human{" +
                    "name='" + name + '\'' +
                    ", gender=" + gen +
                    ", age=" + age +
                    ", has " + children.size() +
                    " children";
        }
    }


}
