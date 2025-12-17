public class MultipleExceptionsExample {
    static class BaseException extends Exception {
        public BaseException(String message) { super(message); }
    }

    static class MiddleException extends BaseException {
        public MiddleException(String message) { super(message); }
    }

    static class SpecificException extends MiddleException {
        public SpecificException(String message) { super(message); }
    }

    static void main(String[] args) {
        // Массив с вариантами для тестирования
        int[] testCases = {1, 2, 3, 4};

        for (int testCase : testCases) {
            System.out.println("Тест #" + testCase + ":");
            try {
                // Вызываем метод с разными параметрами
                processRequest(testCase);
            }
            // Разные исключения обрабатываются одинаково
            catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Ошибка ввода/вычисления: " + e.getMessage());
                System.out.println("Пожалуйста, проверьте корректность данных");
            } catch (IllegalArgumentException e) {
                System.out.println("Некорректный аргумент: " + e.getMessage());
            }
        }
    }

    public static void processRequest(int option) {
        try {
            switch (option) {
                case 1:
                    // ArithmeticException
                    int result = 10 / 0;
                    break;
                case 2:
                    // ArrayIndexOutOfBoundsException
                    int[] arr = {1, 2, 3};
                    int value = arr[5];
                    break;
                case 3:
                    // IllegalArgumentException
                    validateAge(-5);
                    break;
                default:
                    System.out.println("Корректное выполнение");
            }
        } catch (Exception e) {
            throw e; // Пробрасываем для обработки в main
        }
    }

    public static void validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным: " + age);
        }
    }
}