package com.javarush.test.level11.lesson11.bonus03;

/* Задача по алгоритмам
Написать метод, который возвращает минимальное и максимальное числа в массиве.
*/

class Solution {
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("Minimum is " + result.x);
        System.out.println("Maximum is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<>(null, null);
        }

        int buf = 0;
        boolean isWork = false;
        while (!isWork) {
            isWork = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isWork = false;
                    buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }
            }
        }

        return new Pair<>(array[0], array[array.length - 1]);
    }

    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
