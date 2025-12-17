package com.examples;

public class StringMethodsDemo {
    static void main(String[] args) {
        String text = "   Hello, Java World!   ";
        String anotherText = "HELLO, JAVA WORLD!";

        // 1. length() - возвращает длину строки
        System.out.println("1. Длина строки: " + text.length());

        // 2. trim() - удаляет пробелы в начале и конце строки
        String trimmed = text.trim();
        System.out.println("2. trim(): '" + trimmed + "'");

        // 3. toUpperCase() - преобразует все символы в верхний регистр
        System.out.println("3. toUpperCase(): " + text.toUpperCase());

        // 4. toLowerCase() - преобразует все символы в нижний регистр
        System.out.println("4. toLowerCase(): " + text.toLowerCase());

        // 5. substring() - возвращает часть строки
        System.out.println("5. substring(3, 8): " + text.substring(3, 8));

        // 6. replace() - заменяет символы в строке
        String replaced = text.replace("Java", "Programming");
        System.out.println("6. replace('Java', 'Programming'): " + replaced);

        // 7. equals() - сравнивает строки с учетом регистра
        System.out.println("7. equals(): " + text.equals(anotherText));

        // 8. equalsIgnoreCase() - сравнивает строки без учета регистра
        System.out.println("8. equalsIgnoreCase(): " + text.equalsIgnoreCase(anotherText));

        // 9. contains() - проверяет, содержит ли строка подстроку
        System.out.println("9. contains('Java'): " + text.contains("Java"));

        // 10. split() - разбивает строку на массив по разделителю
        String[] words = trimmed.split(" ");
        System.out.println("10. split():");
        for (String word : words) {
            System.out.println("   - " + word);
        }
    }
}
