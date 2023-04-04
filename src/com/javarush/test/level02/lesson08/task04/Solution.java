package com.javarush.test.level02.lesson08.task04;

/* Минимум четырех чисел
Написать функцию, которая вычисляет минимум из четырёх чисел.
Использовать функцию из задачи 1.
*/

class Solution {

    public static int min(int a, int b, int c, int d) {
        int mainMin;

        int AandB = min(a, b);

        int CandD = min(c, d);

        mainMin = min(AandB, CandD);

        return mainMin;
    }

    public static int min(int a, int b) {
        int min = 0;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        return min;
    }

}