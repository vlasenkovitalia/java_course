package com.example.liskov.correct;

// Абстракция для фигур
interface Shape {
    int getArea();
}

// Конкретные реализации
class Rectangle implements Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getArea() {
        return width * height;
    }
}

class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}

// Клиентский код, соответствующий принципу Лисков
public class LSPCompliantExample {
    public static void printArea(Shape shape) {
        System.out.println("Площадь: " + shape.getArea());
    }

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 4);
        Shape square = new Square(4);

        printArea(rectangle); // 20
        printArea(square);    // 16

        // Оба работают корректно
    }
}