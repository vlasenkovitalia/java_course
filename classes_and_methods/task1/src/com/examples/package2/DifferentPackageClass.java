package com.examples.package2;

import com.examples.package1.ParentClass;

public class DifferentPackageClass {
    public void demonstrateAccess() {
        System.out.println("\nДоступ из другого пакета (не наследник)");

        ParentClass parent = new ParentClass();

        // Доступ к полям:
        // System.out.println(parent.privateField);    // ошибка: недоступно
        // System.out.println(parent.defaultField);    // ошибка: недоступно (разные пакеты)
        // System.out.println(parent.protectedField);  // ошибка: недоступно (не наследник)
        System.out.println("publicField: " + parent.publicField);        // доступно

        // Доступ к методам:
        // parent.privateMethod();    // ошибка: недоступно
        // parent.defaultMethod();    // ошибка: недоступно (разные пакеты)
        // parent.protectedMethod();  // ошибка: недоступно (не наследник)
        parent.publicMethod();        // доступно

        // Доступ к конструкторам:
        ParentClass parent1 = new ParentClass();            // доступно
        // ParentClass parent2 = new ParentClass("test");  // ошибка: недоступно (разные пакеты)
        // ParentClass parent3 = new ParentClass(42);      // ошибка: недоступно (разные пакеты)
        // ParentClass parent4 = new ParentClass(true);    // ошибка: недоступно
    }
}