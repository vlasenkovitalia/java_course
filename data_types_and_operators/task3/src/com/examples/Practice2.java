package com.examples;

public class Practice2 {
    public static void main(String[] args) {
        System.out.println("1. Базовые примеры с иерархией наследования:");

        class Animal {
            public String toString() { return "Animal"; }
        }

        class Dog extends Animal {
            public String toString() { return "Dog"; }
        }

        class Cat extends Animal {
            public String toString() { return "Cat"; }
        }

        Animal animal = new Dog();
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println("   Созданы: animal = new Dog(), dog = new Dog(), cat = new Cat()");

        System.out.println("\n   animal instanceof Animal: " + (animal instanceof Animal));
        System.out.println("   animal instanceof Dog:    " + (animal instanceof Dog));
        System.out.println("   dog instanceof Animal:    " + (dog instanceof Animal));
        System.out.println("   cat instanceof Animal:    " + (cat instanceof Animal));
        //System.out.println("   dog instanceof Cat:       " + (dog instanceof Cat));  // Inconvertible types; cannot cast 'Dog' to 'Cat'

        System.out.println("\n2. Проверка для интерфейсов:");

        interface Swimmer {
            void swim();
        }

        class Fish extends Animal implements Swimmer {
            public void swim() { System.out.print(""); }
            public String toString() { return "Fish"; }
        }

        Fish fish = new Fish();
        System.out.println("   Создан: fish = new Fish() (реализует Swimmer)");

        System.out.println("\n   fish instanceof Swimmer: " + (fish instanceof Swimmer));
        System.out.println("   fish instanceof Animal:  " + (fish instanceof Animal));
        System.out.println("   fish instanceof Fish:    " + (fish instanceof Fish));

        System.out.println("\n3. Проверка с массивами:");
        int[] numbers = new int[5];
        String[] strings = new String[3];

        System.out.println("   int[] numbers = new int[5];");
        System.out.println("   String[] strings = new String[3];");

        System.out.println("\n   numbers instanceof int[]:    " + (numbers instanceof int[]));
        System.out.println("   numbers instanceof Object:   " + (numbers instanceof Object));
        System.out.println("   strings instanceof String[]: " + (strings instanceof String[]));
        System.out.println("   strings instanceof Object:   " + (strings instanceof Object));

        System.out.println("\n4. Проверка instanceof с null:");
        Animal nullAnimal = null;
        String nullString = null;

        System.out.println("   Animal nullAnimal = null;");
        System.out.println("   String nullString = null;");

        System.out.println("\n   nullAnimal instanceof Animal: " + (nullAnimal instanceof Animal));
        System.out.println("   nullAnimal instanceof Dog:    " + (nullAnimal instanceof Dog));
        System.out.println("   nullAnimal instanceof Object: " + (nullAnimal instanceof Object));
        System.out.println("   nullString instanceof String: " + (nullString instanceof String));

        System.out.println("\n5. Безопасное приведение типов:");
        Animal someAnimal = new Dog();

        System.out.println("   Animal someAnimal = new Dog();");

        if (someAnimal instanceof Dog) {
            Dog myDog = (Dog) someAnimal;
            System.out.println("   someAnimal instanceof Dog: true - можно безопасно привести");
            System.out.println("   Приведение: Dog myDog = (Dog) someAnimal;");
        }

        System.out.println("\n6. Проверка с Object и String:");
        Object obj = "Hello";
        System.out.println("   Object obj = \"Hello\";");

        System.out.println("\n   obj instanceof String: " + (obj instanceof String));
        System.out.println("   obj instanceof Object: " + (obj instanceof Object));

        System.out.println("\n7. Проверка по цепочке наследования:");
        Object objDog = new Dog();
        System.out.println("   Object objDog = new Dog();");

        System.out.println("\n   objDog instanceof Object:  " + (objDog instanceof Object));
        System.out.println("   objDog instanceof Animal:  " + (objDog instanceof Animal));
        System.out.println("   objDog instanceof Dog:     " + (objDog instanceof Dog));
        System.out.println("   objDog instanceof Cat:     " + (objDog instanceof Cat));
    }
}