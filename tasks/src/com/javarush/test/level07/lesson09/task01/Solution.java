package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/


class Solution {


    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> dividesBy3 = new ArrayList<>();
        ArrayList<Integer> dividesBy2 = new ArrayList<>();
        ArrayList<Integer> undivided = new ArrayList<>();


        for (int i = 0; i < 20; i++) {
            String s = reader.readLine();
            int x = Integer.parseInt(s);
            list.add(x);
        }

        for (Integer x : list) {
            if (x % 3 == 0 && x % 2 == 0) {
                dividesBy3.add(x);
                dividesBy2.add(x);
            } else if (x % 3 == 0) {
                dividesBy3.add(x);
            } else if (x % 2 == 0) {
                dividesBy2.add(x);
            } else {
                undivided.add(x);
            }
        }

        printList(dividesBy3);
        printList(dividesBy2);
        printList(undivided);
    }

    private static void printList(List<Integer> list) {
        for (Integer x : list) {
            System.out.println(x);
        }

    }
}
