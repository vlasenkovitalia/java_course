package com.example;

public class UserValidator {

    public void validateUser(String username, int age) throws ValidationException {
        if (username == null || username.trim().isEmpty()) {
            throw new ValidationException("Имя пользователя не может быть пустым");
        }

        if (username.length() < 3) {
            throw new ValidationException(
                    "Имя пользователя должно содержать минимум 3 символа"
            );
        }

        if (age < 0 || age > 150) {
            throw new ValidationException(
                    String.format("Недопустимый возраст: %d. Возраст должен быть от 0 до 150.", age)
            );
        }

        System.out.println("Пользователь " + username + " прошел валидацию");
    }

    public void validateAndSave(String username, int age) throws ValidationException {
        try {
            validateUser(username, age);
            // Здесь мог бы быть код сохранения в базу данных
        } catch (ValidationException e) {
            // Используем конструктор с причиной для создания цепочки исключений
            throw new ValidationException("Ошибка при сохранении пользователя: " + username, e);
        }
    }
}
