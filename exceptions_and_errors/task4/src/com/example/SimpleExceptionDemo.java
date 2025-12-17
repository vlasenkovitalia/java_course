package com.example;

public class SimpleExceptionDemo {
    static void main(String[] args) {
        UserValidator validator = new UserValidator();

        try {
            validator.validateUser("ab", 25); // Слишком короткое имя
        } catch (ValidationException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            validator.validateUser("John", -5); // Отрицательный возраст
        } catch (ValidationException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            validator.validateAndSave("ValidUser", 30); // Успешно
        } catch (ValidationException e) {
            System.out.println("Ошибка: " + e.getMessage());
            if (e.getCause() != null) {
                System.out.println("Причина: " + e.getCause().getMessage());
            }
        }
    }
}