package com.examples.override;

// Пример 3: Работа с дженериками

class GenericExample {
    static class Base<T> {
        public void process(T item) {
            System.out.println("Processing in base: " + item);
        }
    }

    static class Derived extends Base<String> {
        @Override  // указываем, что переопределяем метод с конкретным типом
        public void process(String item) {
            System.out.println("Processing in derived: " + item.toUpperCase());
        }
    }
}