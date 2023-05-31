package com.javarush.test.level08.lesson11.home04;

/* Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Solution {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(reader.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        getIntegerList(N, list);
        int min = getMinimum(list);
        System.out.println(min);
    }

    public static void getIntegerList(int N, List<Integer> list) throws IOException {
        for (int i = 0; i < N; i++) {
            int k = Integer.parseInt(reader.readLine());
            list.add(k);
        }
    }

    public static int getMinimum(List<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            Integer value = list.get(i);
            if (min > value) {
                min = value;
            }
        }
        return min;
    }


}
