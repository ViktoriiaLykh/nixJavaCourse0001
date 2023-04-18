package com.javarush.test.level07.lesson09.task04;

import java.util.ArrayList;

/* Буква «р» и буква «л»
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
Пример:
роза
лира
лоза
Выходные данные:
лира
лоза
лоза
*/

class Solution {

    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        list.add("роза");
        list.add("лира");
        list.add("лоза");

        System.out.println(fix(list));
    }

    private static ArrayList<String> fix(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.contains("р") && s.contains("л")) {
                continue;
            }

            if (s.contains("р")) {
                i--;
                list.remove(s);
            } else if (s.contains("л")) {
                i++;
                list.add(i, s);
            }
        }
        return list;
    }
}