package com.javarush.test.level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть закрыть файл и поток.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(consoleReader.readLine()));
        List<String> list = createListFromFile(fileReader);

        for (String s : list) {
            System.out.println(s);
        }

        consoleReader.close();

    }

    public static List<String> createListFromFile(BufferedReader in) throws IOException {
        List<String> list = new ArrayList<>();
        String s = in.readLine();

        while (s != null) {
            list.add(s);
            s = in.readLine();
        }
        in.close();
        return list;
    }


}
