package com.javarush.test.level12.lesson09.task04;

/* Fly, Run, Swim для классов Human, Duck, Penguin, Airplane
Есть public интерфейсы Fly(летать), Run(бежать/ездить), Swim(плавать).
Добавь эти интерфейсы классам Human(человек), Duck(утка), Penguin(пингвин), Airplane(самолет).
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


    public class Human implements Run, Swim {
        @Override
        public void run() {

        }

        @Override
        public void swim() {

        }

    }

    public class Duck implements Run, Swim, Fly {
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

    public class Airplane implements Fly, Run {
        @Override
        public void fly() {

        }

        @Override
        public void run() {

        }

    }
}
