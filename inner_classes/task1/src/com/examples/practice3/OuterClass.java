package com.examples.practice3;

public class OuterClass {
    public class PublicInner {
        public String publicField = "public";
        protected String protectedField = "protected";
        String packagePrivateField = "package-private";  // default
        private String privateField = "private";

        public void publicMethod() {
            System.out.println("publicMethod");
        }

        protected void protectedMethod() {
            System.out.println("protectedMethod");
        }

        void packagePrivateMethod() {
            System.out.println("packagePrivateMethod");
        }

        private void privateMethod() {
            System.out.println("privateMethod");
        }
    }

    // Метод внешнего класса - имеет ПОЛНЫЙ доступ к внутреннему классу
    public void testFullAccess() {
        PublicInner inner = new PublicInner();

        System.out.println("publicField: " + inner.publicField);
        System.out.println("protectedField: " + inner.protectedField);
        System.out.println("packagePrivateField: " + inner.packagePrivateField);
        System.out.println("privateField: " + inner.privateField);

        inner.publicMethod();
        inner.protectedMethod();
        inner.packagePrivateMethod();
        inner.privateMethod();
    }

    // Даже приватный метод внешнего класса имеет доступ
    private void privateOuterMethod() {
        PublicInner inner = new PublicInner();
        System.out.println("Из приватного метода: " + inner.privateField);
    }
}

// Другой класс в том же пакете
class AnotherClassInSamePackage {
    public void testAccess() {
        OuterClass outer = new OuterClass();

        // Создаем внутренний класс через внешний
        OuterClass.PublicInner inner = outer.new PublicInner();

        System.out.println("publicField: " + inner.publicField);
        System.out.println("protectedField: " + inner.protectedField);
        System.out.println("packagePrivateField: " + inner.packagePrivateField);

        // System.out.println("privateField: " + inner.privateField); // ошибка компиляции

        inner.publicMethod();
        inner.protectedMethod();
        inner.packagePrivateMethod();
        // inner.privateMethod();       // ошибка компиляции
    }
}

// Главный класс
class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();

        outer.testFullAccess();

        AnotherClassInSamePackage another = new AnotherClassInSamePackage();
        another.testAccess();

        // Тест из другого класса через объект
        OuterClass.PublicInner innerFromMain = outer.new PublicInner();
        System.out.println("publicField: " + innerFromMain.publicField);
        // System.out.println("privateField: " + innerFromMain.privateField); // ошибка
    }
}