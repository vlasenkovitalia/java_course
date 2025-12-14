package com.examples.package2;

import com.examples.package1.ParentClass;

public class ChildClass extends ParentClass {
    public void demonstrateAccess() {
        System.out.println("\nДоступ из подкласса в другом пакете");

        // Создаем экземпляр родительского класса
        ParentClass parent = new ParentClass();

        // Доступ к полям через родительский экземпляр:
        // System.out.println(parent.privateField);    // ошибка: недоступно
        // System.out.println(parent.defaultField);    // ошибка: недоступно (разные пакеты)
        // System.out.println(parent.protectedField);  // ошибка: недоступно через экземпляр
        System.out.println("publicField: " + parent.publicField);        // доступно

        // Доступ к методам через родительский экземпляр:
        // parent.privateMethod();    // ошибка: недоступно
        // parent.defaultMethod();    // ошибка: недоступно (разные пакеты)
        // parent.protectedMethod();  // ошибка: недоступно через экземпляр
        parent.publicMethod();        // доступно

        // protected доступен через наследование
        System.out.println("\nДоступ через наследование:");
        System.out.println("protectedField (через this): " + this.protectedField);  // доступно
        this.protectedMethod();  // доступно

        // Вызов конструкторов:
        ParentClass parent1 = new ParentClass();            // доступно
        // ParentClass parent2 = new ParentClass("test");  // ошибка: недоступно (разные пакеты)
        // ParentClass parent3 = new ParentClass(42);      // ошибка: недоступно (разные пакеты)
        // ParentClass parent4 = new ParentClass(true);    // ошибка: недоступно
    }
}