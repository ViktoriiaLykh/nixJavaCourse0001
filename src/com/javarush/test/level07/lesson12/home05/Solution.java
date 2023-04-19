package com.javarush.test.level07.lesson12.home05;

/* Бум
Написать программу, которая ведёт обратный отсчёт с 30 до 0, и в конце выводит на экран текст «Бум!».
Программа должна уменьшать число 10 раз в секунду. Для того чтобы вставить в программу задержку, воспользуйся функцией:
Thread.sleep(100); //задержка на одну десятую секунды.
Пример:
30
29
…
1
0
Бум!
*/

class Solution {
    public static void main(String[] args) throws InterruptedException {
        int count = 30;

        while (count >= 0){
            System.out.println(count);
            Thread.sleep(100);
            count--;
        }

        System.out.println("Бум!");
    }


}
