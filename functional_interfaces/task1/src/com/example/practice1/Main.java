package com.example.practice1;

interface MyInterface {
    void abstractMethod();  // абстрактный метод

    default void display() {  // неабстрактный метод
        System.out.println("Display method in MyInterface");
    }

    static void staticMethod() {  // статический метод
        System.out.println("Static method in MyInterface");
    }
}

class MyClass implements MyInterface {
    @Override
    public void abstractMethod() {  // реализация абстрактного метода
        System.out.println("Abstract method implemented in MyClass");
    }

    @Override  // можно переопределить неабстрактный метод
    public void display() {
        System.out.println("Display method in MyClass");
    }

    public void nonStaticMethod() {  // нестатический метод класса
        System.out.println("Non-static method in MyClass");
    }
}

public class Main {
    static void main(String[] args) {
        MyClass myClass = new MyClass();

        /* default и нестатические методы нельзя вызывать через имя интерфейса/класса */

        // вызов абстрактного метода (реализованного в классе)
        myClass.abstractMethod(); // Вывод: Abstract method implemented in MyClass

        // вызов неабстрактного метода (переопределенного в классе)
        myClass.display(); // Вывод: Display method in MyClass

        // вызов нестатического метода класса
        myClass.nonStaticMethod(); // Вывод: Non-static method in MyClass

        // вызов статического метода интерфейса (нельзя вызывать через экземпляр класса)
        MyInterface.staticMethod(); // Вывод: Static method in MyInterface
    }
}
