package com.javarush.test.level02.lesson08.task02;

/**
 * Написать функцию, которая вычисляет максимум из двух чисел.
 */
public class Solution {
    public static void main(String[] args) {
        int a = 3;
        int b = 7;
        System.out.print(max(a, b));
    }


    public static int max(int a, int b) {
        int max = 0;
        if ( b > a ) {
            max = b;
        } else {
            max = a;
        }
        return max;
    }
}