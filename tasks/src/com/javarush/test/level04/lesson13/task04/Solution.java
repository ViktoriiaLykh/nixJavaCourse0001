package com.javarush.test.level04.lesson13.task04;

/* Рисуем линии
Используя цикл for вывести на экран:
-	горизонтальную линию из 10 восьмёрок
-	вертикальную линию из 10 восьмёрок.
*/

class Solution {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print("8");
        }
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.println("8");
        }
    }
}
