package com.examples;

public class Practice1Wrappers {
    public static void main(String[] args) {
        System.out.println("1. Автоупаковка и автораспаковка");
        Integer i1 = 10;  // автоупаковка
        Integer i2 = 20;

        int sum = i1 + i2;  // автораспаковка и сложение

        System.out.println("\n2. Операторы с присваиванием для оберток:");
        System.out.println("   До: i1 = " + i1);
        i1 += 5;
        System.out.println("   После i1 += 5: i1 = " + i1);

        System.out.println("\n3. Сравнение оберток:");
        boolean compare = i1 > i2;
        System.out.println("   i1 > i2: " + i1 + " > " + i2 + " = " + compare);

        System.out.println("\n4. == для оберток (пул значений):");
        Integer a = 127;
        Integer b = 127;
        Integer c = 128;
        Integer d = 128;

        System.out.println("   Integer a = 127;");
        System.out.println("   Integer b = 127;");
        System.out.println("   Integer c = 128;");
        System.out.println("   Integer d = 128;");

        System.out.println("\n   a == b: " + (a == b) + " (значения из пула до 127)");
        System.out.println("   c == d: " + (c == d) + " (разные объекты для 128+)");
        System.out.println("   c.equals(d): " + c.equals(d) + " (правильное сравнение)");

        System.out.println("\n5. Операции с другими обертками:");
        Double d1 = 3.14;
        Double d2 = 2.71;
        System.out.println("   Double d1 = 3.14;");
        System.out.println("   Double d2 = 2.71;");
        System.out.println("   d1 + d2 = " + (d1 + d2));

        Boolean bool1 = true;
        Boolean bool2 = false;
        System.out.println("\n   Boolean bool1 = true;");
        System.out.println("   Boolean bool2 = false;");
        System.out.println("   bool1 && bool2 = " + (bool1 && bool2));
    }
}