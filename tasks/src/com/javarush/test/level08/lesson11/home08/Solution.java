package com.javarush.test.level08.lesson11.home08;

/* Пять наибольших чисел
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int k = Integer.parseInt(reader.readLine());
            list.add(k);
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                Integer a = list.get(i);
                Integer b = list.get(j);
                if (a > b) {
                    int buf = a;
                    list.set(i, b);
                    list.set(j, buf);
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }

    }


}
