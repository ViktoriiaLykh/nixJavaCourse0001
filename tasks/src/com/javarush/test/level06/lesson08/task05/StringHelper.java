package com.javarush.test.level06.lesson08.task05;

/* Класс StringHelper
Cделать класс StringHelper, у которого будут 2 статических метода:
String multiply(String s, int count) – возвращает строку повторенную count раз.
String multiply(String s) – возвращает строку повторенную 5 раз.
Пример:
Амиго -> АмигоАмигоАмигоАмигоАмиго
*/

class StringHelper {
    public static void multiply(String s, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(s);
        }

    }

    public static void multiply(String s) {
        multiply(s, 5);
    }
}

