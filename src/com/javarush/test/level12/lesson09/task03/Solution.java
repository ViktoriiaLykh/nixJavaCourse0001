package com.javarush.test.level12.lesson09.task03;

/* Fly, Run, Swim для классов Dog, Fish, Bird, Airplane
Есть public интерфейсы Fly(летать), Run(бежать/ездить), Swim(плавать).
Добавь эти интерфейсы классам Dog(собака), Fish(рыба), Bird(птица), Airplane(самолет).
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

    public class Dog implements Run, Swim {
        @Override
        public void run() {

        }

        @Override
        public void swim() {

        }

    }

    public class Fish implements Swim, Fly {
        @Override
        public void fly() {

        }

        @Override
        public void swim() {

        }

    }

    public class Bird implements Fly, Run {
        @Override
        public void fly() {

        }

        @Override
        public void run() {

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
