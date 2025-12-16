package com.examples;

import java.util.List;
import java.util.ArrayList;
import com.examples.inheritance.*;

public class Practice2Super {
    // метод может добавить Dog в список, который предназначен для Animal или его предков (Creature, Object).
    public static void addDogsToList(List<? super Dog> list) {
        // безопасно для записи
        list.add(new Dog());
        // list.add(new Animal()); // ошибка, если передали в функцию список типа Dog (Animal может быть и Cat)
        // list.add(new Object()); // ошибка

        // чтение возможно, но только как Object, но лучше уж тогда использовать extends
        Object obj = list.get(0);
        // Animal a = list.get(0); // ошибка, небезопасно (может быть список типа Creature)
    }

    static void main(String[] args) {
        List<Object> objectList = new ArrayList<>();
        List<Creature> creatureList = new ArrayList<>();
        List<Animal> animalList = new ArrayList<>();
        List<Dog> dogList = new ArrayList<>();

        addDogsToList(objectList);   // OK, Object super Dog
        addDogsToList(creatureList); // OK, Creature super Dog
        addDogsToList(animalList);   // OK, Animal super Dog
        addDogsToList(dogList);      // OK, Dog super Dog
        dogList.get(0).bark();

        //List<Cat> catList = new ArrayList<>();
        //addDogsToList(catList); // ошибка, Cat не является super для Dog
    }
}