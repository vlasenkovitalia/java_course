public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String str = null;
        try {
            int length = str.length(); // Попытка доступа к методу у null
        } catch (NullPointerException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}