package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Solution {


    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(consoleReader.readLine()));
        List<Integer> list = createListFromFile(fileReader);
        removeValue(list);
        sortList(list);


        for (Integer integer : list) {
            System.out.println(integer);
        }
    }

    public static List<Integer> createListFromFile(BufferedReader in) throws IOException {
        List<Integer> list = new ArrayList<>();
        String numbers = in.readLine();

        while (numbers != null) {
            list.add(Integer.parseInt(numbers));
            numbers = in.readLine();
        }
        in.close();
        return list;
    }

    public static void removeValue(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number % 2 != 0) {
                iterator.remove();
            }
        }
    }

    public static void sortList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    int buf = list.get(j);
                    list.set(j, list.get(i));
                    list.set(i, buf);
                }
            }
        }
    }
}
