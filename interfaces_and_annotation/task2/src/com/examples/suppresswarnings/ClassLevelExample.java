package com.examples.suppresswarnings;


@SuppressWarnings("serial")
class LegacyClass implements java.io.Serializable {
    // No serialVersionUID - normally generates warning
    private String data;

    public LegacyClass(String data) {
        this.data = data;
    }

    @SuppressWarnings("deprecation")
    public void useDeprecatedMethod() {
        // Устаревший метод Thread.stop()
        Thread thread = new Thread(() -> {
            // Некоторая работа
        });
        thread.start();
        thread.stop(); // Устаревший метод
    }
}

public class ClassLevelExample {
    public static void main(String[] args) {
        LegacyClass obj = new LegacyClass("Test");
        obj.useDeprecatedMethod();
    }
}