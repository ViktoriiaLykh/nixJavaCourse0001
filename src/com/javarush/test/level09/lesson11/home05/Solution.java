package com.javarush.test.level09.lesson11.home05;

/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите любую строчку из своей любимой песни");
        String string = reader.readLine();
        letterSorter(string);
    }

    public static ArrayList<Character> letterSorter(String string) throws IOException {
        ArrayList<Character> vowels = new ArrayList<>();
        ArrayList<Character> consonantOrPunctuation = new ArrayList<>();

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c == 'а' || c == 'о' || c == 'и' || c == 'ы' || c == 'у' || c == 'э' ||  c == 'е' || c == 'ю' ||
                    c == 'А' || c == 'О' || c == 'И' || c == 'Ы' || c == 'У' || c == 'Э' ||  c == 'Е' || c == 'Ю') {
                vowels.add(c);
            } else if (c == ' '){}
           else  {
                consonantOrPunctuation.add(c);
            }
        }

        System.out.println("Гласные буквы:");
        for (Character ch : vowels) {
            System.out.print(ch + " ");
        }
        System.out.println("\nСогласные буквы, знаки препинания, цифры: ");
        for (Character ch1 : consonantOrPunctuation) {
            System.out.print(ch1 + " ");
        }
        return vowels;
    }

}
