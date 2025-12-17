public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            methodThatThrowsExceptions();
        } catch (ArithmeticException e) {
            System.out.println("Перехвачено исключение: " + e.getMessage());
        }

        // Это исключение не будет перехвачено, что приведет к аварийному завершению
        methodThatThrowsUncheckedException();
    }

    public static void methodThatThrowsExceptions() {
        // Генерация ArithmeticException
        int result = 10 / 0; // Деление на ноль
    }

    public static void methodThatThrowsUncheckedException() {
        // Генерация NullPointerException, которое не будет перехвачено
        String str = null;
        int length = str.length(); // Попытка доступа к методу у null
    }
}
