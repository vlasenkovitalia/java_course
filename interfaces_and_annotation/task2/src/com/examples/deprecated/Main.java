package com.examples.deprecated;
import java.util.Arrays;

// Пример 1: Устаревший класс
@Deprecated(since = "2.0", forRemoval = true)
class OldDatabaseConnector {
    public void connect() {
        System.out.println("Connecting using old protocol...");
    }
}

class NewDatabaseConnector {
    public void connect() {
        System.out.println("Connecting using new secure protocol...");
    }
}

// Пример 2: Устаревший метод
class Calculator {
    /**
     * Старый метод вычисления. Используйте {@link #addNumbers(int...)} вместо него.
     * @deprecated Начиная с версии 1.5, используйте addNumbers(int...)
     */
    @Deprecated(since = "1.5", forRemoval = false)
    public int add(int a, int b) {
        return a + b;
    }

    public int addNumbers(int... numbers) {
        return Arrays.stream(numbers).sum();
    }
}

// Пример 3: Устаревшее поле
class Configuration {
    @Deprecated(since = "3.0")
    public static final String OLD_CONFIG_PATH = "/old/config.xml";

    public static final String NEW_CONFIG_PATH = "/new/config.json";
}

// Пример использования (компилятор выдаст предупреждение)
public class Main {
    public static void main(String[] args) {
        /* Error: 'com.examples.deprecated.OldDatabaseConnector'
        is deprecated since version 2.0 and marked for removal */

        //OldDatabaseConnector old = new OldDatabaseConnector();
        //old.connect();

        Calculator calc = new Calculator();
        // Warning: 'add(int, int)' is deprecated since version 1.5
        int result = calc.add(5, 3);

        // Используем новый метод
        int newResult = calc.addNumbers(5, 3, 2, 1);

        // Warning: 'OLD_CONFIG_PATH' is deprecated since version 3.0
        String path = Configuration.OLD_CONFIG_PATH;
    }
}