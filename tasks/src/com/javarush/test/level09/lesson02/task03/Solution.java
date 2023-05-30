package com.javarush.test.level09.lesson02.task03;

/* Метод должен вернуть номер строки кода, из которого вызвали этот метод
Написать пять методов, которые вызывают друг друга. Метод должен вернуть номер строки кода,
 из которого вызвали этот метод. Воспользуйся функцией: element.getLineNumber().
*/

class Solution {
    public static void main(String[] args) {
        System.out.println(func1());
    }

    public static int func1() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println(func2());
        return stackTrace[1].getLineNumber();
    }

    public static int func2() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println(func3());
        return stackTrace[1].getLineNumber();
    }

    public static int func3() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println(func4());
        return stackTrace[1].getLineNumber();
    }

    public static int func4() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println(func5());
        return stackTrace[1].getLineNumber();
    }

    public static int func5() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        return stackTrace[1].getLineNumber();
    }


}
