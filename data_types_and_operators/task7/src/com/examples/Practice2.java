package com.examples;

public class Practice2 {
    static void main(String[] args) {
        // Суммирование четных чисел, пока не встретится отрицательное число
        int[] values = {5, 6, 1, 3, 4, 12, 9, 11, 8, -3, 15, 7};
        int sum = 0;

        for (int value : values) {
            if (value < 0) {
                System.out.println("обнаружено отрицательное число: " + value);
                break;
            }

            if (value % 2 != 0) {
                System.out.println("пропускаем нечетное число: " + value);
                continue;
            }

            sum += value;
            System.out.println("добавили четное число " + value + ", текущая сумма: " + sum);
        }

        System.out.println("итоговая сумма четных чисел до первого отрицательного: " + sum);
    }
}
