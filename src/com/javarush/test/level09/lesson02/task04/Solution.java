package com.javarush.test.level09.lesson02.task04;

/* Стек-трейс длиной 10 вызовов
Напиши код, чтобы получить стек-трейс длиной 10 вызовов.
*/

class Solution {

    static int counter = 0;
    public static void main(String[] args) {
        function1();
    }

    private static void function1() {
        counter++;
        function2();
    }

    private static void function2() {
        counter++;
        if (counter == 10) {
            for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
                System.out.println(element.getMethodName());
            }
            return;
        }
        function1();
    }

}
