package com.javarush.test.level05.lesson12.bonus03;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine()); // N = 3
        if (N <= 0) {
            System.out.println("Please, enter positive number");
            return;
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            int entered = Integer.parseInt(reader.readLine());
            max = max(entered, max);
        }

        System.out.println(max);
    }

    private static int max(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }
}
