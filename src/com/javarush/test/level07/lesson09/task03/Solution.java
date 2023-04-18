package com.javarush.test.level07.lesson09.task03;

/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

import java.util.ArrayList;

class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("мама ");
        list.add("именно ");
        list.add("мыла ");
        list.add("именно ");
        list.add("раму ");
        list.add("именно ");


        for (String s : list) {
            System.out.println(s);
        }
    }


}
