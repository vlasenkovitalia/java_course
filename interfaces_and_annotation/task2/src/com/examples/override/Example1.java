package com.examples.override;

// Пример 1: Переопределение метода родительского класса

class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }

    public void eat(String food) {
        System.out.println("Eating " + food);
    }
}

class Dog extends Animal {
    @Override  // явно указываем, что переопределяем метод
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    // ошибка компиляции - Method does not override method from its superclass
    //@Override
    //public void eat(int food) { ... }
}