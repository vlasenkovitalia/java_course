package com.examples;

public class Practice1 {
    static void main(String[] args) {
        // бесконечный цикл с условием, которое всегда истинно
        int value = 1;
        while (value > 0) {  // value всегда больше 0, так как мы его увеличиваем
            value++;
        }

        // более очевидный бесконечный цикл
        while (true) {
            System.out.println("Этот while выполняется вечно");
        }

        int counter = 0;
        do {
            System.out.println("Бесконечный do-while: " + counter);
            counter++;
        } while (counter >= 0);  // counter всегда >= 0

        // классический бесконечный do-while
        do {
            System.out.println("Выполняется минимум один раз и потом вечно");
        } while (true);
    }
}
