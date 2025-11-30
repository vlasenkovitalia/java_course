package com.example.liskov.violation;

// Базовый класс - Прямоугольник
class Rectangle {
    protected int width;
    protected int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}

// Подкласс - Квадрат, нарушающий принцип Лисков
class Square extends Rectangle {
    // Нарушение: изменяем поведение сеттеров
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }
    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }
}

public class LSPViolationExample {

    public static void testRectangle(Rectangle rectangle) {
        rectangle.setWidth(5);
        rectangle.setHeight(4);

        // Ожидаем площадь 20 (5 * 4)
        System.out.println("Ожидаемая площадь: 20");
        System.out.println("Фактическая площадь: " + rectangle.getArea());

        // Для Rectangle работает, для Square - нет!
        // Square вернет 16 (4 * 4), а не 20
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        testRectangle(rect); // Работает корректно

        Rectangle squareAsRect = new Square();
        testRectangle(squareAsRect); // Нарушение!
    }
}