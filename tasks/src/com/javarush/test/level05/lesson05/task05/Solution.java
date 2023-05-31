package com.javarush.test.level05.lesson05.task05;

/* Провести три боя  попарно между котами
Создать три кота используя класс Cat.
Провести три боя попарно между котами.
Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
Результат каждого боя вывести на экран.
*/

import com.javarush.test.level05.lesson05.task02.Cat;

class Solution {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "Vaska";
        cat1.age = 5;
        cat1.weight = 6;
        cat1.strength = 2;

        Cat cat2 = new Cat();
        cat2.name = "Barsik";
        cat2.age = 3;
        cat2.weight = 7;
        cat2.strength = 8;

        Cat cat3 = new Cat();
        cat3.name = "Seva";
        cat3.age = 1;
        cat3.weight = 3;
        cat3.strength = 4;

       playMatch(cat1, cat2);
       playMatch(cat2, cat3);
       playMatch(cat1, cat3);
    }


    private static void playMatch(Cat cat1, Cat cat2) {
        boolean result = cat1.fight(cat2);
        if (result) {
            System.out.println(cat1.name + " winner");
        } else {
            System.out.println(cat2.name + " winner");
        }
    }
}
