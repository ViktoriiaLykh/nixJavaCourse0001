package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести все строки в файл.
*/

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = consoleReader.readLine();
        List<String> stringList = createList(consoleReader);
        addListToFile(stringList, fileName);

    }

    public static List<String> createList(BufferedReader consoleReader) throws IOException {
        List<String> stringList = new ArrayList<>();
        String string = "";
        while (true) {
            string = consoleReader.readLine();
            if (string.equals("exit")) {
                break;
            }
            stringList.add(string);
        }
        return stringList;
    }

    public static void addListToFile(List<String> stringList, String fileName) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        for (String string : stringList) {
            writer.write(string + "\n");
        }
        writer.close();
    }


}
