import java.util.Scanner;


void main() {
    System.out.print("Пожалуйста, введите ваше имя: ");

    try (Scanner scanner = new Scanner(System.in)) {
        String name = scanner.nextLine();
        System.out.println("Привет, " + name + "!");
    } catch (Exception e) {
        System.out.println("Ошибка ввода: " + e.getMessage());
    }
}
