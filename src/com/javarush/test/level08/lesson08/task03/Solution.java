package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

class Solution {
    public static void main(String[] args) {
        HashMap<String, String> map = createMap();

        System.out.println(getCountTheSameFirstName(map, "Александр"));
        System.out.println(getCountTheSameLastName(map, "Сергеевич"));
    }

    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Шелест", "Александр");
        map.put("Лихвар", "Андрей");
        map.put("Сергеевич", "Андрей");
        map.put("Пирожков", "Артур");
        map.put("Антонов", "Антон");
        map.put("Батрудинов", "Тимур");
        map.put("Александрова", "Кристина");
        map.put("Батькович", "Александр");
        map.put("Александров", "Максим");
        map.put("Сапсан", "Инокентий");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int nameDuplicateCount = 0;

        for (String value : map.values()) {
            if (value.equals(name)) {
                nameDuplicateCount++;
            }
        }

        return nameDuplicateCount;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya) {
        int familiyaDuplicateCount = 0;

        for (String surname : map.keySet()) {
            if (surname.equals(familiya)) {
                familiyaDuplicateCount++;
            }
        }

        return familiyaDuplicateCount;
    }
}
