package com.javarush.test.level04.lesson13.task02;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int k = 0; k < n; k++) {
                System.out.print("8");
            }
        }


    }


}
