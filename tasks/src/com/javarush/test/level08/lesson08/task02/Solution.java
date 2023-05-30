package com.javarush.test.level08.lesson08.task02;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Solution {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(25);
        hashSet.add(2);
        hashSet.add(5);
        hashSet.add(11);
        hashSet.add(10);
        hashSet.add(100);
        hashSet.add(3);
        hashSet.add(55);
        hashSet.add(69);
        hashSet.add(12);
        hashSet.add(9);
        hashSet.add(78);
        hashSet.add(96);
        hashSet.add(6);
        hashSet.add(523);
        hashSet.add(-458);
        hashSet.add(42);
        hashSet.add(4);
        hashSet.add(71);
        hashSet.add(1);

        for (Iterator<Integer> iterator = hashSet.iterator(); iterator.hasNext(); ) {
            Integer i = iterator.next();
            if (i >= 10) {
                iterator.remove();
            }
        }
    }
}
