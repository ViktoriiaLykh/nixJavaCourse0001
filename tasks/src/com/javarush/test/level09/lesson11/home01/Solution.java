package com.javarush.test.level09.lesson11.home01;

/* Деление на ноль
Создай метод public static void divisionByZero, в котором подели любое число на ноль и выведи на экран результат деления.
Оберни вызов метода divisionByZero в try..catch. Выведи стек-трейс исключения используя метод exception.printStackTrace()
*/

class Solution {
    public static void main(String[] args) {
        try {
            divisionByZero(15);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void divisionByZero(int a) {
        int b = 0;
        int result = a / b;
        System.out.println(result);
    }

}
