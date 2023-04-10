package com.javarush.test.level05.lesson05.task03;

/* Геттеры и сеттеры для класса Dog
Создать class Dog. У собаки должна быть кличка String name и возраст int age.
Создайте геттеры и сеттеры для всех переменных класса Dog.
*/

class Dog {
    private String name;
    private int age;

    private void setName(String name) {
        this.name = name;
    }

    private String getName() {
        return name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private int getAge() {
        return age;
    }
}
