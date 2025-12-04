package datatypes;

public class DataTypesExamples {
    // Члены класса (поля) инициализируются значениями по умолчанию автоматически
    byte byteDefault;           // 0
    short shortDefault;         // 0
    int intDefault;             // 0
    long longDefault;           // 0L
    float floatDefault;         // 0.0f
    double doubleDefault;       // 0.0d
    char charDefault;           // '\u0000' (null character)
    boolean booleanDefault;     // false

    // Примеры с явной инициализацией (включая нулевые)
    byte byteValue = 100;               // -128 до 127
    byte byteZero = 0;                  // нулевое значение
    short shortValue = 1000;            // -32768 до 32767
    short shortZero = 0;                // нулевое значение
    int intValue = 100000;              // -2^31 до 2^31-1
    int intZero = 0;                    // нулевое значение
    long longValue = 10000000000L;      // с суффиксом L
    long longZero = 0L;                 // нулевое значение
    float floatValue = 10.5f;           // с суффиксом f
    float floatZero = 0.0f;             // нулевое значение
    double doubleValue = 20.99;         // без суффикса или d
    double doubleZero = 0.0;            // нулевое значение
    char charValue = 'A';               // один символ
    char charUnicode = '\u0041';        // 'A' в Unicode
    char charZero = '\u0000';           // нулевое значение (невидимый)
    boolean booleanTrue = true;         // логическое true
    boolean booleanFalse = false;       // логическое false (нулевое)

    // Ссылочные типы
    String stringDefault = null;        // null для объектов
    String stringValue = "Hello";
    Object objectDefault = null;
}
