package com.javarush.test.level10.lesson11.home10;

/* Пять наибольших чисел
Создать список целых чисел. Ввести с клавиатуры 10 целых чисел.
Создать метод по безопасному извлечения чисел из списка:
int safeGetElement(ArrayList<Integer> list, int index, int defaultValue)
Метод должен возвращать элемент списка (list) по его индексу (index).
Если в процессе получения элемента возникло исключение, его нужно перехватить, и метод должен вернуть defaultValue.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> numbers = enterNumbers();
        int element = safeGetElement(numbers, 5, 1);
        System.out.println(element);
    }

    public static ArrayList<Integer> enterNumbers() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int number = Integer.parseInt(reader.readLine());
            numbers.add(number);
        }
        return numbers;
    }

    public static int safeGetElement(ArrayList<Integer> list, int index, int defaultValue) {
        int number = 0;
        try {
            number = list.get(index);
        } catch (IndexOutOfBoundsException e) {
            number = defaultValue;
        }
        return number;
    }
}
