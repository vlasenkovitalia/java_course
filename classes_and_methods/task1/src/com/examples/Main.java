package com.examples;

import com.examples.package1.ParentClass;
import com.examples.package1.SamePackageClass;
import com.examples.package2.ChildClass;
import com.examples.package2.DifferentPackageClass;

public class Main {
    public static void main(String[] args) {
        System.out.println("Демонстрация спецификаторов доступа в Java\n");

        // 1. Доступ из того же класса
        ParentClass parent = new ParentClass();
        parent.publicMethod();

        // 2. Доступ из того же пакета
        SamePackageClass samePackage = new SamePackageClass();
        samePackage.demonstrateAccess();

        // 3. Доступ из подкласса в другом пакете
        ChildClass child = new ChildClass();
        child.demonstrateAccess();

        // 4. Доступ из другого пакета (не наследник)
        DifferentPackageClass differentPackage = new DifferentPackageClass();
        differentPackage.demonstrateAccess();
    }
}