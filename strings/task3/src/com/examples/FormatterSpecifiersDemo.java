package com.examples;

import java.util.Formatter;

public class FormatterSpecifiersDemo {
    static void main(String[] args) {
        Formatter formatter = new Formatter();

        // 1. %s - строковое представление
        formatter.format("1. Строка: %s%n", "Привет, мир!");
        formatter.format("   Имя: %s, Фамилия: %s%n%n", "Иван", "Иванов");

        // 2. %d - десятичное целое
        int age = 25;
        int year = 2024;
        formatter.format("2. Целые числа:%n");
        formatter.format("   Возраст: %d лет%n", age);
        formatter.format("   Год: %d, Количество: %d%n%n", year, 100);

        // 3. %f - десятичное с плавающей точкой
        double price = 99.99;
        float temperature = 36.6f;
        formatter.format("3. Числа с плавающей точкой:%n");
        formatter.format("   Цена: %.2f руб.%n", price);
        formatter.format("   Температура: %.1f°C%n", temperature);
        formatter.format("   Точность (3 знака после запятой): %.3f%n%n", Math.PI);

        // 4. %h - хэш-код
        String text = "Hello";
        formatter.format("6. Хэш-коды:%n");
        formatter.format("   Хэш строки 'Hello': %h%n", text);
        formatter.format("   Хэш числа 123: %h%n%n", 123);

        // 5. %e - экспоненциальное представление
        double smallNumber = 0.00012345;
        double largeNumber = 123456789.0;
        formatter.format("7. Экспоненциальная запись:%n");
        formatter.format("   Малое число: %e%n", smallNumber);
        formatter.format("   Большое число: %e%n%n", largeNumber);


        // Выводим результат
        System.out.println(formatter);

        // Пример с System.out.format (более короткая запись)
        System.out.format("Имя: %s, Баланс: %,.2f руб., Активен: %b%n",
                "Алексей", 12345.67, true);

        // Пример с String.format
        String message = String.format("Привет, %s! Тебе %d лет.", "Мария", 28);
        System.out.println(message);

        // Закрываем Formatter
        formatter.close();
    }
}