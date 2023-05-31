package com.javarush.test.level04.lesson16.home03;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while (true) {
            int input = Integer.parseInt(reader.readLine());
            sum = sum + input;
            if (input == -1) {
                break;
            }
        }
        System.out.println(sum);
    }
}
