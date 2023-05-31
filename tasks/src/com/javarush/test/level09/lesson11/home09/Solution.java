package com.javarush.test.level09.lesson11.home09;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public static class Cat {

        public static void main(String[] args) {
            String name;

            Map<String, Cat> map = new HashMap<>();
            map.put("Мурзик", new Cat());
            map.put("Барсик", new Cat());
            map.put("Симба", new Cat());
            map.put("Васька", new Cat());
            map.put("Лео", new Cat());
            map.put("Том", new Cat());
            map.put("Рыжик", new Cat());
            map.put("Черныш", new Cat());
            map.put("Гарфилд", new Cat());
            map.put("Баги", new Cat());

            Set<String> names = new HashSet<>();


            for (Map.Entry<String, Cat> pair : map.entrySet()) {
                String key = pair.getKey();
                name = key;
                names.add(name);
            }

            for (String s : names) {
                System.out.println(s);
            }
        }
    }


}
