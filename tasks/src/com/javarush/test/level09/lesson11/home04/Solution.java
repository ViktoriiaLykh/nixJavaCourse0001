package com.javarush.test.level09.lesson11.home04;

/* Конвертер дат
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Solution {

    static String inputDate;

    public static void main(String[] args) throws IOException, ParseException {
        System.out.println("Введите дату в формате «ММ/ДД/ГГГГ»");
        dateFormatter();


    }

    public static void dateFormatter() throws ParseException {

        SimpleDateFormat inputFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = inputFormat.parse(inputDate);

        SimpleDateFormat outputFormat = new SimpleDateFormat("MMM dd, yyyy");
        String outputDate = outputFormat.format(date);
        System.out.println(outputDate);
    }


}
