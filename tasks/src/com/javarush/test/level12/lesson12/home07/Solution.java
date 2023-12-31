package com.javarush.test.level12.lesson12.home07;

/* Fly, Run, Swim для классов Duck, Penguin, Toad
Есть интерфейсы Fly(летать), Swim(плавать), Run(бегать).
Добавь эти интерфейсы классам Duck(утка), Penguin(пингвин), Toad(жаба)
*/

public class Solution {

    interface Fly {

        void fly();
    }

    interface Run {

        void run();
    }

    interface Swim {

        void swim();
    }

    public class Duck implements Fly, Run, Swim {


        @Override
        public void fly() {

        }

        @Override
        public void run() {

        }

        @Override
        public void swim() {

        }
    }

    public class Penguin implements Run, Swim {


        @Override
        public void run() {

        }

        @Override
        public void swim() {

        }
    }

    public class Toad implements Swim {

        @Override
        public void swim() {

        }
    }
}
