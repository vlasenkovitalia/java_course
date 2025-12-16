package com.examples.inheritance;

public class Cat extends Animal {
    public void meow() {
        System.out.println(getClass().getSimpleName() + " мяукает: мяу");
    }
}
