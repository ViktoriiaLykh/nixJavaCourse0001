package com.javarush.test.level08.lesson11.home01;

/* Set из котов
1. Внутри класса Solution создать public static класс кот – Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве. Каждый кот с новой строки.
*/

import java.util.HashSet;
import java.util.Set;

class Solution {

    public static void main(String[] args) {
        Set<Cat> cats = Cat.createCats();

        cats.remove(new Cat());

        printCats(cats);
    }

    private static void printCats(Set<Cat> cats) {
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

    public static class Cat {

        public static Set<Cat> createCats() {
            Set<Cat> catSet = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                catSet.add(new Cat());
            }
            return catSet;
        }
    }


}
