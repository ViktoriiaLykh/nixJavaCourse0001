package com.javarush.test.level08.lesson08.task04;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

import java.text.ParseException;
import java.util.*;

class Solution {
    public static void main(String[] args) throws ParseException {
        Map<String, Date> map = new HashMap<>();

        map.put("Иванов", new Date(99, Calendar.JUNE, 12));
        map.put("Смирнов", new Date(100, Calendar.JULY, 3));
        map.put("Кузнецов", new Date(99, Calendar.JUNE, 12));
        map.put("Петров", new Date(99, Calendar.SEPTEMBER, 12));
        map.put("Соколов", new Date(99, Calendar.AUGUST, 12));
        map.put("Михайлов", new Date(99, Calendar.NOVEMBER, 12));
        map.put("Новиков", new Date(99, Calendar.JUNE, 12));
        map.put("Федоров", new Date(99, Calendar.OCTOBER, 12));
        map.put("Васильев", new Date(99, Calendar.MAY, 12));
        map.put("Морозов", new Date(99, Calendar.MARCH, 12));

        for (Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator(); iterator.hasNext(); ) {
            Map.Entry<String, Date> pair = iterator.next();
            int i = pair.getValue().getMonth();
            if (i >= 5 && i <= 7) {
                iterator.remove();
            }
        }

        for (Map.Entry<String, Date> stringDateEntry : map.entrySet()) {
            System.out.println(stringDateEntry);
        }
    }
}
