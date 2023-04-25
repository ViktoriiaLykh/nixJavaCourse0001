package com.javarush.test.level09.lesson11.home02;

/* Обратный отсчёт от 10 до 0
Написать в цикле обратный отсчёт от 10 до 0. Для задержки иcпользовать Thread.sleep(100);
Обернуть вызов sleep в try..catch.
*/

class Solution {

    public static void main(String[] args) throws InterruptedException {
        try {
            sleep();
        } catch (Exception e) {
        }
    }

    public static int sleep() throws InterruptedException {
        int i = 10;
        for (i = 10; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(100);
        }
        return i;
    }
}
