package com.example;

public class ValidationException extends Exception {

    // Конструктор 1: Только сообщение
    public ValidationException(String message) {
        super(message);
    }

    // Конструктор 2: Сообщение и причина
    public ValidationException(String message, Throwable cause) {
        super(message, cause);
    }

    // Конструктор 3: Без параметров (сообщение по умолчанию)
    public ValidationException() {
        super("Ошибка валидации");
    }
}