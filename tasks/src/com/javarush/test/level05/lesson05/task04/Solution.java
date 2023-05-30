package com.javarush.test.level05.lesson05.task04;

/* Создать три объекта типа Cat
В методе main создать три объекта типа Cat и заполнить их данными.
Использовать класс Cat из первой задачи. Класс Cat создавать не надо.
*/

import com.javarush.test.level05.lesson05.task01.Cat;

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
    }

}
