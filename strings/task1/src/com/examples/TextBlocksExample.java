package com.examples;

public class TextBlocksExample {
    static void main(String[] args) {
        // 1: без Text Blocks (старый способ)
        String oldWay = "{\n" +
                "  \"name\": \"Иван\",\n" +
                "  \"age\": 25,\n" +
                "  \"city\": \"Москва\"\n" +
                "}";
        System.out.println("Старый способ:\n" + oldWay);

        // 2: с Text Blocks
        String json = """
                      {
                        "name": "Иван",
                        "age": 25,
                        "city": "Москва"
                      }
                      """;
        System.out.println("\nС Text Blocks:\n" + json);

        // 3: SQL запрос
        String sqlQuery = """
                          SELECT u.name, u.email, o.total
                          FROM users u
                          JOIN orders o ON u.id = o.user_id
                          WHERE u.active = true
                          AND o.date >= '2024-01-01'
                          ORDER BY o.total DESC
                          """;
        System.out.println("SQL запрос:\n" + sqlQuery);

        // 4: HTML документ
        String html = """
                      <!DOCTYPE html>
                      <html>
                      <head>
                          <title>Пример</title>
                      </head>
                      <body>
                          <h1>Привет, мир!</h1>
                          <p>Это пример HTML.</p>
                      </body>
                      </html>
                      """;
        System.out.println("HTML документ:\n" + html);

        // 5: С переменными (используем formatted())
        String name = "Анна";
        int score = 95;
        String message = """
                         Уважаемый(ая) %s,
                         
                         Ваш результат тестирования: %d баллов.
                         Поздравляем с успешным прохождением!
                         
                         С уважением,
                         Команда разработчиков
                         """.formatted(name, score);
        System.out.println("Письмо:\n" + message);

        // 6: Сохранение форматирования кода
        String codeExample = """
                             public class Example {
                                 public static void main(String[] args) {
                                     // Это пример кода
                                     System.out.println("Hello, World!");
                                 }
                             }
                             """;
        System.out.println("Пример кода:\n" + codeExample);
    }
}