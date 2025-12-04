package datatypes;

public class TypePromotion {
    static void main(String[] args) {
        byte b = 100;
        short s = 1000;
        int i = 100000;
        long l = 10000000000L;
        float f = 3.14f;
        double d = 2.71828;

        // byte + short -> int
        int result1 = b + s;  // byte и short повышаются до int
        System.out.println("byte + short = int: " + result1);

        // int + long -> long
        long result2 = i + l;  // int повышается до long
        System.out.println("int + long = long: " + result2);

        // long + float -> float
        float result3 = l + f;  // long повышается до float
        System.out.println("long + float = float: " + result3);

        // float + double -> double
        double result4 = f + d;  // float повышается до double
        System.out.println("float + double = double: " + result4);

        // char + int -> int (char неявно преобразуется в int)
        char ch = 'A';  // Unicode 65
        int result5 = ch + 10;
        System.out.println("'A' + 10 = " + result5 + " (символ: " + (char)result5 + ")");

        // Деление с разными типами
        int intVal = 5;
        double doubleVal = 2.0;
        double division = intVal / doubleVal;  // int повышается до double
        System.out.println("5 / 2.0 = " + division);  // 2.5, а не 2!
    }
}
