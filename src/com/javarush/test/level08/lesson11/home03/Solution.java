package com.javarush.test.level08.lesson11.home03;

/* Люди с одинаковыми именами и/или фамилиями
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
*/

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Шелест", "Александр");
        map.put("Лихвар", "Андрей");
        map.put("Сергеевич", "Андрей");
        map.put("Пирожков", "Артур");
        map.put("Шелест", "Антон");
        map.put("Батрудинов", "Тимур");
        map.put("Шелест", "Кристина");
        map.put("Батькович", "Александр");
        map.put("Александров", "Максим");
        map.put("Сапсан", "Инокентий");
        System.out.println(map);

    }
}
