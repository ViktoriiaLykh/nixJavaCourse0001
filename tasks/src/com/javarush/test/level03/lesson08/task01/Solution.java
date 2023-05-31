package com.javarush.test.level03.lesson08.task01;

/* Как захватить мир
Ввести с клавиатуры число и имя, вывести на экран строку:
«имя» захватит мир через «число» лет. Му-ха-ха!
Пример: Вася захватит мир через 8 лет. Му-ха-ха!
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {

  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String name = reader.readLine();
    String sYear = reader.readLine();
    int nYear = Integer.parseInt(sYear);
    System.out.print(name + " захватит мир через " + nYear + " лет. Му-ха-ха!");


  }


}
