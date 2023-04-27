package com.javarush.test.level10.lesson11.home09;

/* Одинаковые слова в списке
Ввести с клавиатуры в список 10 слов. Нужно подсчитать количество одинаковых слов в списке.
Результат нужно представить в виде словаря Map<String, Integer>,
где первый параметр – уникальная строка,
а второй – число, сколько раз данная строка встречалась в списке.
Вывести содержимое словаря на экран.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public static void main(String[] args) throws IOException {
        List<String> stringInput = getStringInput();
        Map<String, Integer> map = countWords(stringInput);
        printMap(map);
    }

    public static List<String> getStringInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String input = reader.readLine();
            strings.add(input);
        }
        return strings;
    }

    public static Map<String, Integer> countWords(List<String> stringInput) {
        Map<String, Integer> wordCount = new HashMap<>();

        for (String s : stringInput) {
            if (wordCount.containsKey(s)) {
                wordCount.put(s, wordCount.get(s) + 1);
            } else {
                wordCount.put(s, 1);
            }
        }

        return wordCount;
    }

    public static void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
    }
}
