package com.examples.package1;

public class ParentClass {
    private String privateField = "Приватное поле";

    String defaultField = "Поле с доступом по умолчанию";

    protected String protectedField = "Защищенное поле";

    public String publicField = "Публичное поле";

    private void privateMethod() {
        System.out.println("Вызван приватный метод: " + privateField);
    }

    void defaultMethod() {
        System.out.println("Вызван метод с доступом по умолчанию: " + defaultField);
    }

    protected void protectedMethod() {
        System.out.println("Вызван защищенный метод: " + protectedField);
        // Вызов приватного метода из того же класса
        privateMethod();
    }

    public void publicMethod() {
        System.out.println("Вызван публичный метод: " + publicField);
        // Можно вызвать все методы из того же класса
        privateMethod();
        defaultMethod();
        protectedMethod();
    }

    // конструкторы с разными спецификаторами доступа

    public ParentClass() {
        System.out.println("Публичный конструктор ParentClass");
    }

    protected ParentClass(String message) {
        System.out.println("Защищенный конструктор ParentClass: " + message);
    }

    ParentClass(int number) {
        System.out.println("Конструктор ParentClass с доступом по умолчанию: " + number);
    }

    private ParentClass(boolean flag) {
        System.out.println("Приватный конструктор ParentClass: " + flag);
    }
}