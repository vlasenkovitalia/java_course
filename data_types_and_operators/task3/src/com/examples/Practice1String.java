package com.examples;

public class Practice1String {
    public static void main(String[] args) {
        // + и += Конкатенация строк
        String hello = "Hello";
        String world = "World";

        System.out.println("1. Конкатенация строк: hello + \" \" + world");
        String concat1 = hello + " " + world;
        System.out.println("   Результат: \"" + concat1 + "\"");

        System.out.println("\n2. Конкатенация строки и числа: hello + 123");
        String concat2 = hello + 123;
        System.out.println("   Результат: \"" + concat2 + "\"");

        System.out.println("\n3. Конкатенация числа и строки: 456 + hello");
        String concat3 = 456 + hello;
        System.out.println("   Результат: \"" + concat3 + "\"");

        System.out.println("\n4. Сложение с присваиванием: hello += \"!\"");
        System.out.println("   До: hello = \"" + hello + "\"");
        hello += "!";
        System.out.println("   После: hello = \"" + hello + "\"");

        // == и != для объектов
        System.out.println("\n5. Сравнение строк с помощью == (сравнение ссылок)");
        String str1 = "Java";  // добавили в пул строк
        String str2 = "Java";  // ссылается на то же место в пуле строк что и str1
        String str3 = new String("Java");  // новый объект

        System.out.println("\n   str1 == str2: " + (str1 == str2));
        System.out.println("   str1 == str3: " + (str1 == str3));
        System.out.println("   str1.equals(str3): " + str1.equals(str3));

        // Попытка использовать другие операторы
        //System.out.println("   text -= \"abc\"; // Ошибка компиляции!"); Для строк определены только + и +=
    }
}