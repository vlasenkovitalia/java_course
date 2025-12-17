package com.examples;

/*Зачем нужен метод flush()?
1. Гарантия записи данных: После записи данных в буфер они могут не сразу быть отправлены в целевой поток.
Вызов метода flush() гарантирует, что все данные будут немедленно записаны.
2. Управление производительностью: Использование буферов может повысить производительность,
но иногда нужно сбросить их содержимое для обеспечения актуальности данных.
3. Синхронизация: В многопоточных приложениях, если один поток записывает данные в поток вывода,
другой поток может вызвать flush(), чтобы убедиться, что все данные были отправлены.
*/

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FlushExample {
    static void main(String[] args) {
        // Используем try-with-resources для автоматического закрытия ресурсов
        try (FileWriter fileWriter = new FileWriter("output.txt");
             PrintWriter printWriter = new PrintWriter(fileWriter)) {

            // Записываем строку в файл
            printWriter.println("Hello, World!");

            // Сбрасываем буфер
            printWriter.flush();

            // Записываем еще одну строку
            printWriter.println("This is a test.");

            // Не обязательно вызывать flush() перед закрытием,
            // так как close() автоматически вызывает flush()
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
