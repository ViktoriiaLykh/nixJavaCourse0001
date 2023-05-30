package com.javarush.test.level10.lesson11.home08;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести на их экран.
*/

import java.util.ArrayList;

class Solution {

    public static void main(String[] args) {
        ArrayList<String>[] arrayWithStrings = new ArrayList[2];
        arrayWithStrings[0] = new ArrayList<>();
        arrayWithStrings[0].add("Апельсин");
        arrayWithStrings[0].add("Ананас");
        arrayWithStrings[0].add("Клубника");

        arrayWithStrings[1] = new ArrayList<>();
        arrayWithStrings[1].add("Помидор");
        arrayWithStrings[1].add("Огурец");

        for (ArrayList<String> arrayWithString : arrayWithStrings) {
            System.out.println(arrayWithString);
        }
    }


}