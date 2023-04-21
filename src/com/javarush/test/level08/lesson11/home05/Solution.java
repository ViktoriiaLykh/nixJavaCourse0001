package com.javarush.test.level08.lesson11.home05;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Пример ввода:
мама     мыла раму.
Пример вывода:
Мама     Мыла Раму.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        System.out.println(upperCase(s));
    }


    public static String upperCase(String s) {
        char[] array = s.toCharArray();
        boolean foundSpace = true;

        for (int i = 0; i < array.length; i++) {
            if (Character.isLetter(array[i])) {
                if (foundSpace) {
                    array[i] = Character.toUpperCase(array[i]);
                    foundSpace = false;
                }

            } else {
                foundSpace = true;
            }
        }  s = String.valueOf(array);
        return s;
    }
}
