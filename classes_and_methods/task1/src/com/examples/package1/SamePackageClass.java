package com.examples.package1;

public class SamePackageClass {
    public void demonstrateAccess() {
        System.out.println("\nДоступ из того же пакета (package1)");

        ParentClass parent = new ParentClass();

        // Доступ к полям:
        // System.out.println(parent.privateField);    // ошибка: недоступно
        System.out.println("defaultField: " + parent.defaultField);      // доступно
        System.out.println("protectedField: " + parent.protectedField);  // доступно
        System.out.println("publicField: " + parent.publicField);        // доступно

        // Доступ к методам:
        // parent.privateMethod();    // ошибка: недоступно
        parent.defaultMethod();       // доступно
        parent.protectedMethod();     // доступно
        parent.publicMethod();        // доступно

        // Доступ к конструкторам:
        ParentClass parent1 = new ParentClass();            // доступно
        ParentClass parent2 = new ParentClass("test");      // доступно
        ParentClass parent3 = new ParentClass(42);          // Доступно
        // ParentClass parent4 = new ParentClass(true);     // ошибка: недоступно
    }
}