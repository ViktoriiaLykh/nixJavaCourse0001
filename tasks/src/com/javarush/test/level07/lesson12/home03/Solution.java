package com.javarush.test.level07.lesson12.home03;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            int k = Integer.parseInt(reader.readLine());
            list.add(k);
        }
        int min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min)
                min = list.get(i);
        }
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max)
                max = list.get(i);
        }
        System.out.println(min + " " + max);
    }


}
