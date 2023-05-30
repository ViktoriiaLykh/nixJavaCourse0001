package com.javarush.test.level06.lesson11.bonus03;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a[] = new int[5];
        int buf;


        for (int i = 0; i < 5; i++) {
            a[i] = Integer.parseInt(reader.readLine());
        }
        int i;

        for (i = 0; i < 5; i++) {


            for (int j = 0; j < 5; j++) {
                if (a[i] < a[j]) {
                    buf = a[j];
                    a[j] = a[i];
                    a[i] = buf;
                }
            }
        }
        for (i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
    }
}


