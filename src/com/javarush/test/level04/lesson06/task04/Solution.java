package com.javarush.test.level04.lesson06.task04;

/* Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны».
Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s1 = reader.readLine();
        String s2 = reader.readLine();

        if (s1.equals(s2)) {
            System.out.print("Имена идентичны");
        } else if (s1.length() == s2.length() && s1 != s2) {
            System.out.println("Длины имен равны");
        } else {
            System.out.print("Имена не совпадают");
        }
    }


}
