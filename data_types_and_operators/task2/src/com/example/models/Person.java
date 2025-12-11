package com.example.models;

/**
 * Класс, представляющий человека.
 * Содержит базовую информацию о человеке: имя, возраст и email.
 *
 * @author Виталия Власенко
 * @version 2.0
 * @since 1.0
 */
public class Person {
    private String name;
    private int age;
    private String email;

    /**
     * Конструктор по умолчанию. Создает человека с пустыми полями.
     */
    public Person() {
        this.name = "";
        this.age = 0;
        this.email = "";
    }

    /**
     * Конструктор с параметрами.
     *
     * @param name  имя человека (не должно быть null или пустым)
     * @param age   возраст человека (должен быть положительным)
     * @param email email адрес
     * @throws IllegalArgumentException если возраст отрицательный
     * @see #validateAge(int)
     */
    public Person(String name, int age, String email) {
        validateAge(age);
        this.name = name;
        this.age = age;
        this.email = email;
    }

    /**
     * Проверяет корректность возраста.
     *
     * @param age проверяемый возраст
     * @throws IllegalArgumentException если возраст отрицательный
     * @since 2.0
     */
    private void validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
    }

    /**
     * Возвращает имя человека.
     *
     * @return текущее имя
     */
    public String getName() {
        return name;
    }

    /**
     * Устанавливает новое имя.
     *
     * @param name новое имя (не должно быть null)
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Возвращает возраст человека.
     *
     * @return текущий возраст
     */
    public int getAge() {
        return age;
    }

    /**
     * Устанавливает новый возраст.
     *
     * @param age новый возраст
     * @throws IllegalArgumentException если возраст отрицательный
     * @see #validateAge(int)
     */
    public void setAge(int age) {
        validateAge(age);
        this.age = age;
    }

    /**
     * Возвращает email адрес.
     *
     * @return email адрес
     */
    public String getEmail() {
        return email;
    }

    /**
     * Устанавливает email адрес.
     *
     * @param email новый email адрес
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Проверяет, является ли человек совершеннолетним.
     * В большинстве стран совершеннолетие наступает в 18 лет.
     *
     * @return {@code true} если возраст ≥ 18, иначе {@code false}
     * @see #getAge()
     */
    public boolean isAdult() {
        return age >= 18;
    }

    /**
     * Форматирует информацию о человеке в читаемом виде.
     *
     * @return строка в формате "Имя: [name], Возраст: [age], Email: [email]"
     * @see String#format(String, Object...)
     */
    @Override
    public String toString() {
        return String.format("Имя: %s, Возраст: %d, Email: %s", name, age, email);
    }
}