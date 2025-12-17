package com.examples.practice2;

/*  Внутренний класс имеет доступ ко всем полям и методам внешнего класса,
    независимо от их спецификаторов доступа (благодаря тому,
    что внутренний класс хранит ссылку на экземпляр внешнего класса.). */

public class OuterClass {
    private String outerField = "Outer Field";

    public class InnerClass {
        public void printOuterField() {
            // Доступ к приватному полю внешнего класса
            System.out.println(outerField);
        }
    }
}

class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.printOuterField(); // Выведет: Outer Field
    }
}
