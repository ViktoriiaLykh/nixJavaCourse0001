package com.javarush.test.level05.lesson12.home04;

/* Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 12 2012".
*/

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class Solution {
    public static void main(String[] args) {
        DateFormat formatter = new SimpleDateFormat("dd MM yyyy");

        Date date = new Date();
        String strDate = formatter.format(date);

        System.out.println(strDate);
    }



}

