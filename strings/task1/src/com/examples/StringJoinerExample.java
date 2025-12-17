package com.examples;
import java.util.StringJoiner;

public class StringJoinerExample {
    static void main(String[] args) {
        // простое соединение элементов
        StringJoiner joiner1 = new StringJoiner(", ");
        joiner1.add("Яблоко");
        joiner1.add("Банан");
        joiner1.add("Апельсин");
        System.out.println("Фрукты: " + joiner1.toString());

        // с префиксом и суффиксом
        StringJoiner joiner2 = new StringJoiner(", ", "[", "]");
        joiner2.add("Москва");
        joiner2.add("Санкт-Петербург");
        joiner2.add("Казань");
        System.out.println("Города: " + joiner2.toString());

        // использование в реальном сценарии - SQL запрос
        StringJoiner whereClause = new StringJoiner(" AND ", " WHERE ", "");
        whereClause.add("age > 18");
        whereClause.add("status = 'active'");
        whereClause.add("city = 'Москва'");
        String sql = "SELECT * FROM users" + whereClause.toString();
        System.out.println("SQL запрос: " + sql);

        // объединение StringJoiner
        StringJoiner innerJoiner = new StringJoiner("-");
        innerJoiner.add("2024");
        innerJoiner.add("01");
        innerJoiner.add("15");

        StringJoiner outerJoiner = new StringJoiner("/");
        outerJoiner.add(innerJoiner.toString());
        outerJoiner.add("file.txt");
        System.out.println("Путь к файлу: " + outerJoiner.toString());

        // чтение данных из массива
        String[] colors = {"Красный", "Зеленый", "Синий"};
        StringJoiner colorJoiner = new StringJoiner(", ", "Цвета: ", ".");
        for (String color : colors) {
            colorJoiner.add(color);
        }
        System.out.println(colorJoiner.toString());

        // пустой StringJoiner с значением по умолчанию
        StringJoiner emptyJoiner = new StringJoiner(", ");
        emptyJoiner.setEmptyValue("Список пуст");
        System.out.println("Пустой список: " + emptyJoiner.toString());

        emptyJoiner.add("Первый элемент");
        System.out.println("После добавления: " + emptyJoiner.toString());
    }
}
