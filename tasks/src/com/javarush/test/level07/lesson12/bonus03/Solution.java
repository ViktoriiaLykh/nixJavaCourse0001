package com.javarush.test.level07.lesson12.bonus03;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            String s = reader.readLine();
            int x = Integer.parseInt(s);
            list.add(x);
        }

        sortDesc(list);

        for (Integer number : list) {
            System.out.println(number);
        }
    }

    private static void sortDesc(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    int min = list.get(j);
                    list.set(j, list.get(i));
                    list.set(i, min);
                }
            }
        }
    }
}
