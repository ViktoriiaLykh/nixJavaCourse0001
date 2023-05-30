package com.javarush.test.level08.lesson11.home02;

/* Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки
*/

import java.util.HashSet;
import java.util.Set;

class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set pets = join(cats, dogs);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static void printPets(Set pets) {
        for (Object o : pets) {
            System.out.println(o);
        }
    }

    public static Set join(Set<Cat> cats, Set<Dog> dogs) {
        Set pets = new HashSet<>();
        pets.addAll(cats);
        pets.addAll(dogs);
        return pets;
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            cats.add(new Cat());
        }
        return cats;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> dogs = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            dogs.add(new Dog());
        }
        return dogs;
    }

    public static void removeCats(Set pets, Set<Cat> removeCats) {
        pets.removeAll(removeCats);
    }

    public static class Cat {

    }

    public static class Dog {

    }

}
