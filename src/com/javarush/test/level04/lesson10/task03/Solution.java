package com.javarush.test.level04.lesson10.task03;

/* Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String val = reader.readLine();
        int N = Integer.parseInt(reader.readLine());
        int i = 0;
        while (i < N) {
            System.out.println(val);
            i++;
        }

    }





}
