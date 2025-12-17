package com.examples.override;

// Пример 2: Реализация метода интерфейса

interface Shape {
    double calculateArea();
    default void printInfo() {
        System.out.println("This is a shape");
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override  // реализуем абстрактный метод интерфейса
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override  // переопределяем default-метод (Java 8+)
    public void printInfo() {
        System.out.println("This is a circle with radius: " + radius);
    }
}
