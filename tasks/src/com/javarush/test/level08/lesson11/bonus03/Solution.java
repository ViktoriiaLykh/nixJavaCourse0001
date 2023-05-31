package com.javarush.test.level08.lesson11.bonus03;

/* Задача по алгоритмам
Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке.
*/

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("море");
        list.add("книга");
        list.add("солнце");
        list.add("музыка");
        list.add("любовь");
        list.add("город");
        list.add("дом");
        list.add("лес");
        list.add("звезда");
        list.add("океан");
        list.add("гора");
        list.add("река");
        list.add("мечта");
        list.add("яблоко");
        list.add("кошка");
        list.add("счастье");
        list.add("телефон");
        list.add("небо");
        list.add("дождь");
        list.add("бегство");

        Collections.sort(list);
        System.out.println(list);
    }
}
