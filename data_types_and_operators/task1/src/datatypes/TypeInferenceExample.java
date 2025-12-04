package datatypes;

import java.util.ArrayList;
import java.util.HashMap;

public class TypeInferenceExample {
    static void main(String[] args) {
        // var - не ключевое слово, а зарезервированное имя типа
        // Тип переменной определяется на основе типа инициализатора

        // 1. Простые типы
        var name = "Vitalia";  // String
        var age = 25;          // int
        var height = 1.65;     // double
        var isStudent = true;  // boolean

        System.out.println(name.getClass());  // class java.lang.String
        System.out.println(((Object)age).getClass());  // class java.lang.Integer (автоупаковка)

        // 2. Коллекции и generics
        var list = new ArrayList<String>();  // ArrayList<String>
        list.add("Java");
        list.add("Programming");

        var map = new HashMap<Integer, String>();  // HashMap<Integer, String>
        map.put(1, "One");
        map.put(2, "Two");

        // 3. В циклах
        for (var item : list) {
            System.out.println(item);  // item выводится как String
        }

        // 4. С var обязательно инициализировать переменную
        // var x;  // ошибка: нельзя использовать var без инициализатора
        // var y = null;  // ошибка: тип не выводится из null

        // 5. Работа с методами
        var result = calculateSum(10, 20);
        System.out.println("Sum: " + result);

        // 6. Ограничения var:
        // - Только для локальных переменных
        // - Нельзя использовать для параметров методов
        // - Нельзя использовать для возвращаемых типов
        // - Нельзя использовать для полей класса
    }

    private static double calculateSum(double a, double b) {
        return a + b;
    }

    // Дополнительные примеры
    public static void moreVarExamples() {
        // Массивы
        var numbers = new int[]{1, 2, 3, 4, 5};  // int[]

        // Анонимные классы
        var obj = new Object() {
            String name = "Test";
            int value = 100;
        };
        System.out.println(obj.name);  // "Test"

        // С потоками
        var thread = new Thread(() -> System.out.println("Hello"));

        // Важно: var сохраняет статическую типизацию
        var message = "Hello";
        // message = 123;  // ошибка: int не может быть преобразован в String
    }
}