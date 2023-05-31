package com.javarush.test.level04.lesson13.task05;

/* Все любят Мамбу
Ввести с клавиатуры имя и используя цикл for 10 раз вывести: [*имя* любит меня.]
Пример текста:
Света любит меня.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        for (int i = 1; i <= 10; i++) {
            System.out.println(name + " любит меня.");

        }
    }
}
