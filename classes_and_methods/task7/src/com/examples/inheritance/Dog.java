package com.examples.inheritance;

public class Dog extends Animal {
    public void bark() {
        System.out.println(getClass().getSimpleName() + " лает: гавгав");
    }
}