package com.javarush.test.level09.lesson11.home08;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел.
Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно.
Заполнить массивы любыми данными и вывести их на экран.
*/

import java.util.ArrayList;
import java.util.List;

class Solution {

    public static void main(String[] args) {
        List<List<Integer>> lists = createLists(5, 2, 4, 7, 0);
        listPrint2(lists);
    }

    public static List<List<Integer>> createLists(int... sizes) {
        List<List<Integer>> result = new ArrayList<>();

        for (int size : sizes) {
            List<Integer> integers = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                integers.add(i);
            }
            result.add(integers);
        }

        return result;
    }

    public static void listPrint2(List<List<Integer>> listList) {
        for (int i = 0; i < listList.size(); i++) {
            List<Integer> list = listList.get(i);
            System.out.println("\nList: " + (i + 1));
            for (Integer integer : list) {
                System.out.print(integer + " ");
            }
        }
    }
}

