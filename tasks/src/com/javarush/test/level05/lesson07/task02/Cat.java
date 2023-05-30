package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен,
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

    public void initialize(String name) {
        initialize(name, 0, 0, null, null);
    }

    public void initialize(String name, int weight, int age) {
        initialize(name, weight, age, null, null);
    }

    public void initialize(String name, int age) {
        initialize(name, STANDARD_WEIGHT, age, null, null);
    }

    public void initialize(int weight, String color) {
        initialize(null, weight, 0, color, null);
    }

    public void initialize(int weight, String color, String address) {
        initialize(null, weight, 0, color, address);
    }

    private void initialize(String name, int weight, int age, String color, String address) {
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
