package com.examples;

public class MethodOverriding {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sound();

        Bee bee = new Bee();
        bee.sound();
    }
}

class Animal {
    void sound(){
        System.out.println("Animal sounds");
    }
}

class Cat extends Animal{
    @Override
    void sound() {
        System.out.println("Cat : meow meow");
    }
}

class Bee extends Animal{
    @Override
    void sound() {
        System.out.println("Bee : buzz buzz");
    }
}