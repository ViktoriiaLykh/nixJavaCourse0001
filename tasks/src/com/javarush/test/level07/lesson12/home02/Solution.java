package com.javarush.test.level07.lesson12.home02;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Solution {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());

        ArrayList<String> lines = readLines(N);
        rearrangeLines(M, lines);

        for (String line : lines) {
            System.out.println(line);
        }
    }

    private static ArrayList<String> readLines(Integer N) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String s = reader.readLine();
            list.add(s);
        }
        return list;
    }

    private static void rearrangeLines(Integer M, ArrayList<String> lines) {
        for (int i = 0; i < M; i++) {
            String x = lines.remove(0);
            lines.add(x);
        }
    }
}