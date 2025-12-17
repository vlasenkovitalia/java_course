void main(String[] args) {
// Так как класс статический, нам НЕ нужен экземпляр интерфейса
// ShapeService.Validator validator = new ShapeService.Validator();
// Вызов нестатического метода (если бы он был)
// validator.someNonStaticMethod();

// в данном случае правильно напрямую по имени класса (без создания экземпляра)
boolean isValid = ShapeService.Validator.isPositive(10.5);
System.out.println("Значение положительное? " + isValid); // true

try {
    ShapeService.Validator.validateRadius(5.0); // OK
    ShapeService.Validator.validateRadius(-2.0); // Выбросит исключение
} catch (IllegalArgumentException e) {
    System.out.println("Ошибка валидации: " + e.getMessage());
}
}
