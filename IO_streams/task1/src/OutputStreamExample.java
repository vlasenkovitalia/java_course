import java.io.*;

public class OutputStreamExample {
    static void main(String[] args) {
        System.out.println("Запись в ByteArrayOutputStream:");

        try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {

            outputStream.write(72);   // 'H'
            outputStream.write(101);  // 'e'
            outputStream.write(108);  // 'l'
            outputStream.write(108);  // 'l'
            outputStream.write(111);  // 'o'
            outputStream.write(32);   // пробел
            outputStream.write(87);   // 'W'
            outputStream.write(111);  // 'o'
            outputStream.write(114);  // 'r'
            outputStream.write(108);  // 'l'
            outputStream.write(100);  // 'd'

            byte[] result = outputStream.toByteArray();
            System.out.println("   Записано байтов: " + result.length);
            System.out.println("   Результат: " + new String(result));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}