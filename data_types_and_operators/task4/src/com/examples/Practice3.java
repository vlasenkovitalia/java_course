package com.examples;

public class Practice3 {
    static void main(String[] args) {
        Integer nullInteger = null; // Автоупаковка - работает без ошибок, но создает null-ссылку
        int primitive;

        // Автораспаковка null => NullPointerException
        try {
            primitive = nullInteger; // Пытаемся извлечь int из null -> Ошибка!
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
