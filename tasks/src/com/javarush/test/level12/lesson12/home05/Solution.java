package com.javarush.test.level12.lesson12.home05;

/* Что это? «Кот», «Тигр», «Лев», «Бык», «Корова», «Животное»
Напиши метод, который определяет, какой объект передали в него.
Программа должна выводить на экран одну из надписей:
«Кот», «Тигр», «Лев», «Бык», «Корова», «Животное».
Замечание: постарайся определять тип животного как можно более точно.
*/

class Solution {

    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    private static String getObjectType(Object o) {
        String s = "";
        if (o instanceof Cat) {
            if (o instanceof Tiger) {
                s = "Тигр";
            } else if (o instanceof Lion) {
                s = "Лев";
            } else {
                s = "Кот";
            }
        } else if (o instanceof Bull) {
            s = "Бык";
        } else if (o instanceof Cow) {
            s = "Корова";
        } else {
            s = "Животное";
        }
        return s;
    }


    static class Cat extends Animal   //<--Классы наследуются!!
    {

    }

    private static class Tiger extends Cat {

    }

    private static class Lion extends Cat {

    }

    private static class Bull extends Animal {

    }

    private static class Cow extends Animal {

    }

    static class Animal {

    }

}
