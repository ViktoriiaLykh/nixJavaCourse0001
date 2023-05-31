package com.javarush.test.level08.lesson08.task05;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Solution {
    public static void main(String[] args) {
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
        System.out.println(TheSameFirstName(map, "Максим"));
    }

    public static int TheSameFirstName(HashMap<String, String> map, String name) {
        for (Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator(); iterator.hasNext(); ) {
            Map.Entry<String, String> pair = iterator.next();
            String value = pair.getValue();
            if (value.equals(name)){
                iterator.remove();
            }
        }
        return map.size();
    }

}
