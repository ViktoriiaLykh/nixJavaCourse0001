package com.javarush.test.level09.lesson06.task01;

/* Исключение при работе с числами
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
int a = 42 / 0;
*/

class Solution {
    public static void main(String[] args) {

        try {
            int a = 42 / 0;
        } catch (ArithmeticException exception) {
            System.out.println(exception.getClass());
        }

    }



}
