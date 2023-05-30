package com.javarush.test.level06.lesson08.task04;

/* Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
void readLn() – ждет нажатия enter [использовать readString()]
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ConsoleReader {
    public static void main(String[] args) throws IOException {
        readString();
        readInt();
        readDouble();
        readLn();
    }

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static String readString() throws IOException {
        return reader.readLine();
    }

    public static int readInt() throws IOException {
       return Integer.parseInt(reader.readLine());
    }

    public static double readDouble() throws IOException {
        return Double.parseDouble(reader.readLine());
    }

    public static void readLn() throws IOException {
        while (true) {
            String s = readString();
            if (s.equals("")) {
                break;
            }
        }

    }

}
