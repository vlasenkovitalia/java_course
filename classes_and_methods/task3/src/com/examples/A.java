package com.examples;

public class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println("a = " + a + ", b = " + b);
    }

    // Вспомогательные методы для демонстрации
    public static void staticMethodInSameClass() {
        System.out.print("Из статического метода того же класса: ");
        printVars();  // Способ 1: прямой вызов
    }

    public void instanceMethodInSameClass() {
        System.out.print("Из нестатического метода того же класса: ");
        this.printVars();  // Способ 2: через this
    }
}