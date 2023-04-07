package com.javarush.test.level04.lesson10.task05;

/* Таблица умножения
Вывести на экран таблицу умножения 10х10 используя цикл while. Числа разделить пробелом.
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
...
*/

class Solution {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;

        while (x <= 10) {

            while (y <= 10) {

                System.out.print(x * y + " ");
                y++;
            }
            y = 1;
            System.out.println("");
            x++;

        }
        System.out.println("");
    }


}
