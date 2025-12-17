// Интерфейс для работы с геометрическими фигурами
public interface ShapeService {

    // Вложенный статический класс (по умолчанию является public и static) для утилитных операций
    class Validator {
        // Метод для проверки положительности значения
        public static boolean isPositive(double value) {
            return value > 0;
        }

        // Метод для проверки допустимости радиуса
        public static void validateRadius(double radius) {
            if (!isPositive(radius)) {
                throw new IllegalArgumentException("Радиус должен быть положительным. Получено: " + radius);
            }
        }
    }

    // Константы, связанные с интерфейсом (также статические и финальные)
    double PI = 3.1415926535;

    // Метод интерфейса (будет реализован)
    double calculateArea();
}