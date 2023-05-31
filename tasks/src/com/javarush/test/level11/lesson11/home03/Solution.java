package com.javarush.test.level11.lesson11.home03;

/* Эволюция
Написать четыре класса: Fish(Рыбы), Animal(Животные), Ape(Обезьяны), Human (Человек).
Унаследовать животных от рыб, обезьян от животных и человека от обезьян.
*/

class Solution {

    public static class Fish {
    }

    public static class Animal extends Fish {
    }

    public static class Ape extends Animal {
    }

    public static class Human extends Ape {
    }

}
