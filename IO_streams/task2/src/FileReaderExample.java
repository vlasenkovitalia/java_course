import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderExample {
    static void main(String[] args) {
        // Укажите путь к файлу
        File file = new File("example.txt");

        // Создаем объект Scanner для чтения из файла
        try (Scanner fileScanner = new Scanner(file)) {
            // Читаем данные из файла построчно
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line); // Выводим строку на консоль
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
    }
}
