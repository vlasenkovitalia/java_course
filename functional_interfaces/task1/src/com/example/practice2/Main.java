package com.example.practice2;

interface InterfaceA {
    default void show() {
        System.out.println("Show method from InterfaceA");
    }
}

interface InterfaceB {
    default void show() {
        System.out.println("Show method from InterfaceB");
    }
}

class MyClass implements InterfaceA, InterfaceB {
    // явное переопределение метода для устранения конфликта
    @Override
    public void show() {
        // можно вызвать метод из одного из интерфейсов, если это необходимо
        InterfaceA.super.show(); // или InterfaceB.super.show();
        System.out.println("Show method from MyClass");
    }
}

public class Main {
    static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.show(); // вывод: Show method from InterfaceA (или InterfaceB), Show method from MyClass
    }
}
