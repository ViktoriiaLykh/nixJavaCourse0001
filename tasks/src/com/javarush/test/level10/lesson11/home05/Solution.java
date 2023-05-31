package com.javarush.test.level10.lesson11.home05;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
…
я 9
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

class Solution {
    public static void main(String[] args) throws IOException {
        String strings = getString();
        Map<Character, Integer> map = letterCount(strings);
        printMap(map);
    }

    public static String getString() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        for (int i = 0; i < 1; i++) {
            result += reader.readLine();
        }
        return result;
    }

    public static Map<Character, Integer> letterCount(String string) {
        char[] charArray = string.toLowerCase().replaceAll("[^\\p{IsAlphabetic}]", "").toCharArray();
        Map<Character, Integer> map = new TreeMap<>();
        for (char letter : charArray) {
            if (map.containsKey(letter)) {
                map.put(letter, map.get(letter) + 1);
            } else {
                map.put(letter, 1);
            }
        }
        return map;
    }

    public static void printMap(Map<Character, Integer> map) {
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }


}
