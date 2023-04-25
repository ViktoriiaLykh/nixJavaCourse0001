package com.javarush.test.level09.lesson02.task02;

/* И снова StackTrace
Написать пять методов, которые вызывают друг друга.
Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.
*/

class Solution {
    public static void main(String[] args) {
        System.out.println(func1());
    }
    public static String func1 (){
        StackTraceElement[] traceElements = Thread.currentThread().getStackTrace();
        System.out.println(func2());
       return traceElements[2].getMethodName();

    }

    public static String func2 (){
        StackTraceElement[] traceElements = Thread.currentThread().getStackTrace();
        System.out.println(func3());
        return traceElements[2].getMethodName();
    }
    public static String func3 (){
        StackTraceElement[] traceElements = Thread.currentThread().getStackTrace();
        System.out.println(func4());
        return traceElements[2].getMethodName();
    }
    public static String func4 (){
        StackTraceElement[] traceElements = Thread.currentThread().getStackTrace();
        System.out.println(func5());
        return traceElements[2].getMethodName();
    }
    public static String func5 (){
        StackTraceElement[] traceElements = Thread.currentThread().getStackTrace();
        return traceElements[2].getMethodName();
    }

}
