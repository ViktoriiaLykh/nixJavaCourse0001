package com.javarush.test.level04.lesson10.task02;

/* 10 чисел наоборот
Вывести на экран числа от 10 до 1 используя цикл while.
*/

import java.io.IOException;

class Solution {

    public static void main(String[] args) throws IOException {

        int i = 10;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }

    }


}
