package com.javarush.test.level12.lesson12.home04;

/* Что это? «Кот», «Тигр», «Лев», «Бык», «хз»
Напиши метод, который определяет, какой объект передали в него.
Программа должна выводить на экран одну из надписей:
«Кот», «Тигр», «Лев», «Бык», «хз».
*/

class Solution {

    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    private static String getObjectType(Object o) {
        String s = "";
        if (o instanceof Cat) {
            s = "Кот";
        } else if (o instanceof Tiger) {
            s = "Тигр";
        } else if (o instanceof Lion) {
            s = "Лев";
        } else if (o instanceof Bull) {
            s = "Бык";
        } else {
            s = "хз";
        }
        return s;
    }

    static class Cat {

    }

    private static class Tiger {

    }

    private static class Lion {

    }

    private static class Bull {

    }

    private static class Pig {

    }
}
