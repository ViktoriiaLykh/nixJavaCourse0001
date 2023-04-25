package com.javarush.test.level09.lesson02.task01;

/* Каждый метод должен возвращать свой StackTrace
Написать пять методов, которые вызывают друг друга. Каждый метод должен возвращать свой StackTrace.
*/

class Solution {
    public static void main(String[] args) {
        func1();
    }

    public static StackTraceElement func1() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTrace) {
            System.out.println(element.getMethodName());
        }
        func2();
        return stackTrace[0];
    }

    public static StackTraceElement func2() {
        StackTraceElement[] traceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : traceElements) {
            System.out.println(element.getMethodName());
        }
        func3();
        return traceElements[0];
    }

    public static StackTraceElement func3() {
        StackTraceElement[] traceElements1 = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : traceElements1) {
            System.out.println(element.getMethodName());
        }
        func4();
        return traceElements1[0];
    }

    public static StackTraceElement func4() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements){
            System.out.println(element.getMethodName());
        }
        func5();
        return stackTraceElements[0];
    }

    public static StackTraceElement func5() {
        StackTraceElement[] traceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : traceElements) {
            System.out.println(element.getMethodName());
        }
        return traceElements[0];
    }
}
