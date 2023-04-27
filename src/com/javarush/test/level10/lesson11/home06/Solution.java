package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

class Solution {
    public class Human {
        private String name;
        private int age;
        private boolean gender;
        private String occupation;
        private String nationality;
        private boolean isMarried;

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, boolean gender, String occupation, String nationality, boolean isMarried) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.occupation = occupation;
            this.nationality = nationality;
            this.isMarried = isMarried;
        }

        public Human(String name, boolean gender, String occupation) {
            this.name = name;
            this.gender = gender;
            this.occupation = occupation;
        }

        public Human(String name, String nationality, boolean isMarried) {
            this.name = name;
            this.nationality = nationality;
            this.isMarried = isMarried;
        }

        public Human(String name, int age, boolean gender, String occupation) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.occupation = occupation;
        }

        public Human(String name, boolean gender, String occupation, String nationality) {
            this.name = name;
            this.gender = gender;
            this.occupation = occupation;
            this.nationality = nationality;
        }

        public Human(String name, String nationality) {
            this.name = name;
            this.nationality = nationality;
        }

        public Human(int age, boolean isMarried) {
            this.age = age;
            this.isMarried = isMarried;
        }

        public Human(String name, int age, String occupation, boolean isMarried) {
            this.name = name;
            this.age = age;
            this.occupation = occupation;
            this.isMarried = isMarried;
        }
    }
}
