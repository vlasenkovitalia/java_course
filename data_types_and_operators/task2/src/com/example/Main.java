package com.example;

import com.example.models.Person;

/**
 * Главный класс приложения для демонстрации функциональности.
 *
 * @author Polytech Java course
 * @version 1.0
 * @see Calculator
 * @see Person
 */
public class Main {

    /**
     * Точка входа в приложение.
     * Демонстрирует использование классов Calculator и Person.
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        demoCalculator();
        demoPerson();
    }

    /**
     * Демонстрирует работу калькулятора.
     */
    private static void demoCalculator() {
        System.out.println("=== Демонстрация Calculator ===");

        double a = 10.5;
        double b = 2.5;

        System.out.printf("Сложение: %.2f + %.2f = %.2f%n", a, b, Calculator.add(a, b));
        System.out.printf("Вычитание: %.2f - %.2f = %.2f%n", a, b, Calculator.subtract(a, b));
        System.out.printf("Умножение: %.2f * %.2f = %.2f%n", a, b, Calculator.multiply(a, b));
        System.out.printf("Деление: %.2f / %.2f = %.2f%n", a, b, Calculator.divide(a, b));

        int n = 5;
        System.out.printf("Факториал %d (итеративный): %d%n", n, Calculator.factorialIterative(n));
        System.out.printf("Факториал %d (рекурсивный): %d%n", n, Calculator.factorialRecursive(n));

        // Использование устаревшего метода
        System.out.printf("Факториал %d (устаревший метод): %d%n", n, Calculator.factorial(n));
    }

    /**
     * Демонстрирует работу с классом Person.
     */
    private static void demoPerson() {
        System.out.println("\n=== Демонстрация Person ===");

        Person person1 = new Person("Иван Иванов", 25, "ivan@example.com");
        Person person2 = new Person("Мария Петрова", 16, "maria@example.com");

        System.out.println(person1);
        System.out.println(person2);

        System.out.printf("%s совершеннолетний: %b%n", person1.getName(), person1.isAdult());
        System.out.printf("%s совершеннолетняя: %b%n", person2.getName(), person2.isAdult());

        // Демонстрация сеттеров
        person1.setAge(26);
        System.out.println("После изменения возраста: " + person1);
    }
}