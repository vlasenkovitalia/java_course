import java.io.*;

public class InputStreamExample {
    static void main(String[] args) {
        System.out.println("Чтение из ByteArrayInputStream:");
        byte[] data = {72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100}; // "Hello World"

        try (InputStream inputStream = new ByteArrayInputStream(data)) {

            // Чтение первого байта
            int firstByte = inputStream.read();
            System.out.println("   Первый байт: " + firstByte +
                    " (символ: '" + (char)firstByte + "')");

            // Чтение всех остальных байтов в массив
            byte[] buffer = new byte[10];
            int bytesRead = inputStream.read(buffer);
            System.out.println("   Прочитано байтов: " + bytesRead);

            // Преобразуем байты в строку
            String text = new String(buffer, 0, bytesRead);
            System.out.println("   Текст: " + text);

            // Проверка конца потока
            int end = inputStream.read();
            System.out.println("   Конец потока: " + end + " (ожидается -1)");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}