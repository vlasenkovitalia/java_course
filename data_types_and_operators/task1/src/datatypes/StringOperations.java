package datatypes;

public class StringOperations {
    static void main(String[] args) {
        // Конкатенация строк с разными типами
        String name = "Alice";
        int age = 25;
        double height = 1.75;
        boolean isStudent = true;
        Object obj = new Object();

        // String + базовые типы (автоматическое преобразование к строке)
        String info = "Имя: " + name + ", Возраст: " + age + ", Рост: " + height;
        System.out.println(info); // "Имя: Vitalia, Возраст: 25, Рост: 1.65"

        // String + boolean
        String status = "Студент: " + isStudent;
        System.out.println(status); // "Студент: true"

        // String + Object (вызовется toString())
        String objInfo = "Объект: " + obj;
        System.out.println(objInfo); // "Объект: java.lang.Object@<hashcode>" (java.lang.Object@3f99bd52)

        // Порядок имеет значение
        String result1 = "Сумма: " + 10 + 5;
        System.out.println(result1); // "Сумма: 105" (конкатенация)
        String result2 = "Сумма: " + (10 + 5);
        System.out.println(result2); // "Сумма: 15" (сначала сложение)

        // С базовыми типами
        int x = 10;
        double y = 3.14;
        String calculation = x + " * " + y + " = " + (x * y);
        System.out.println(calculation); // "10 * 3.14 = 31.4"
    }
}