package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)

Задача конструктора – сделать объект валидным. Например, если вес не известен,
то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста.
А вот имени может и не быть (null). То же касается адреса: null.
*/

class Cat {
    private static final int STANDARD_WEIGHT = 7;
    private static final int AVERAGE_WEIGHT = 5;
    private static final int AVERAGE_AGE = 4;

    private String name;
    private int weight;
    private int age;
    private String color;
    private String address;

    public Cat(String name) {
        this(name, 0, 0, null, null);
    }

    public Cat(String name, int weight, int age) {
        this(name, weight, age, null, null);
    }

    public Cat(String name, int age) {
        this(name, STANDARD_WEIGHT, age, null, null);
    }

    public Cat(int weight, String color) {
        this(null, weight, 0, color, null);
    }

    public Cat(int weight, String color, String address) {
        this(null, weight, 0, color, address);
    }

    public Cat(String name, int weight, int age, String color, String address) {
        if (weight == 0) {
            weight = AVERAGE_WEIGHT;
        }

        if (age == 0) {
            age = AVERAGE_AGE;
        }

        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
        this.address = address;
    }



}
