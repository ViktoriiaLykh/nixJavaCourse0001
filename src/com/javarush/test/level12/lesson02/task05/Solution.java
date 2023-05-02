package com.javarush.test.level12.lesson02.task05;

/* Или «Корова», или «Кит», или «Собака», или «Неизвестное животное»
Написать метод, который определяет, объект какого класса ему передали,
и возвращает результат – одно значение из: «Корова», «Кит», «Собака», «Неизвестное животное».
*/

class Solution {

    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    private static String getObjectType(Object o) {
        String s = "";
        if (o instanceof Cow) {
            s = "Корова";
        } else if (o instanceof Whale) {
            s = "Кит";
        } else if (o instanceof Dog) {
            s = "Собака";
        } else {
            s = "Неизвестное животное";
        }


        return s;
    }

    private static class Cow {

    }

    static class Dog {

    }

    private static class Whale {

    }

    private static class Pig {

    }
}
