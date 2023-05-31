package com.javarush.test.level10.lesson11.bonus03;

/* Задача по алгоритмам
Задача: ввести с клавиатуры 30 чисел. Вывести 10-е и 11-е минимальные числа.
Пояснение:
Самое минимальное число – 1-е минимальное.
Следующее минимальное после него – 2-е минимальное
Пример:
1 6 5  7  1  15   63   88
Первое минимальное – 1
Второе минимальное – 1
Третье минимальное – 5
Четвертое минимальное – 6
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    public static void main(String[] args) throws IOException {
        int[] list = fillList();
        sortList(list);

        System.out.println(list[9] + " " + list[10]);
    }

    public static int[] fillList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] list = new int[29];
        for (int i = 0; i < list.length; i++) {
            int input = Integer.parseInt(reader.readLine());
            list[i] = input;
        }
        return list;
    }

    public static void sortList(int[] listList) {
        int buf = 0;
        boolean isWork = false;
        while (!isWork) {
            isWork = true;
            for (int i = 0; i < listList.length - 1; i++) {
                if (listList[i] > listList[i + 1]) {
                    isWork = false;
                    buf = listList[i];
                    listList[i] = listList[i + 1];
                    listList[i + 1] = buf;
                }
            }
        }
    }
}
