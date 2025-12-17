public class ClassCastExceptionExample {
    public static void main(String[] args) {
        Object obj = new Integer(100);
        try {
            String str = (String) obj; // Неверное приведение типов
        } catch (ClassCastException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
