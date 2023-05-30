package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей.
Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

class Solution {

    public static void main(String[] args) {
        Human grandFather = new Human("Игорь", true, 58, null, null);
        Human grandFather2 = new Human("Максим", true, 64, null, null);
        Human grandMother = new Human("Карина", false, 55, null, null);
        Human grandMother2 = new Human("Альбина", false, 61, null, null);
        Human humanMother = new Human("Настя", false, 33, grandFather, grandMother);
        Human humanFather = new Human("Инокентий", true, 35, grandFather2, grandMother2);
        Human child = new Human("Сева", true, 12, humanFather, humanMother);
        Human child2 = new Human("Алина", false, 5, humanFather, humanMother);
        Human child3 = new Human("Маша", false, 1, humanFather, humanMother);

        System.out.println(grandFather);
        System.out.println(grandFather2);
        System.out.println(grandMother);
        System.out.println(grandMother2);
        System.out.println(humanMother);
        System.out.println(humanFather);
        System.out.println(child);
        System.out.println(child2);
        System.out.println(child3);
    }

}

class Human {
    private String name;
    private boolean gender;
    private int age;
    private Human father;
    private Human mother;


    Human(String name, boolean gender, int age, Human father, Human mother) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.father = father;
        this.mother = mother;
    }

    public String toString() {
        String gen = gender ? "мужской" : "женский";
        String mes = "Имя: " + name + ", пол: " + gen + ", возраст: " + age;
        if (father == null && mother == null) {
            return mes;
        } else {
            return mes + ", отец: " + father.name + ", мать: " + mother.name;
        }

    }


}