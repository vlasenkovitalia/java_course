package com.examples;
import java.util.List;
import java.util.ArrayList;
import com.examples.inheritance.*;

public class Practice2Extends {
    // метод может принять список любых животных (Animal, Dog, Cat)
    public static void feedAll(List<? extends Animal> animals) {
        for (Animal a : animals) { // чтение безопасно - все объекты как минимум Animal
            a.feed();
            // a.bark(); // ошибка, т.к. компилятор знает только, что это Animal
        }

        // animals.add(new Dog()); // нельзя
        // animals.add(new Animal()); // нельзя
        // animals.add(new Object()); // нельзя
        //animals.add(null); // только это разрешено
    }

    static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        List<Dog> dogList = new ArrayList<>();
        List<Cat> catList = new ArrayList<>();

        feedAll(animalList); // OK
        feedAll(dogList);    // OK, Dog extends Animal
        feedAll(catList);    // OK, Cat extends Animal
    }
}