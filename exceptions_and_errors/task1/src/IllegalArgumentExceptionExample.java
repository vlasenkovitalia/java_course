public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        try {
            setAge(-5); // Неверное значение возраста
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным.");
        }
    }
}
