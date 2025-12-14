package com.examples;

public class B extends A {
    public static void testInheritance() {
        System.out.print("Из наследника: ");
        printVars();  // Способ 3: унаследованный вызов
    }
}