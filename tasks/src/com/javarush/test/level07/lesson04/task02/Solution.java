package com.javarush.test.level07.lesson04.task02;

/* Массив из строчек в обратном порядке
1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[10];

        for (int i = 0; i < 8; i++) {
            String s = reader.readLine();
            list[i] = Integer.parseInt(s);
        }


        for (int i = 9; i >= 0; i--)
            System.out.println(list[i]);
    }

}