package datatypes;

public class NarrowingConversion {
    static void main(String[] args) {
        // 1. double -> int (потеря дробной части)
        double d = 123.456;
        int i = (int) d;  // 123
        System.out.println("(int) 123.456 = " + i);

        // 2. long -> int (возможна потеря данных)
        long l = 3000000000L;  // больше чем int может хранить
        int i2 = (int) l;      // будет переполнение
        System.out.println("(int) 3000000000L = " + i2);

        // 3. int -> byte (сохранение только младших 8 бит)
        int largeInt = 257;     // 00000000 00000000 00000001 00000001
        byte b = (byte) largeInt; // сохраняется только 00000001 = 1
        System.out.println("(byte) 257 = " + b);  // 1

        // 4. float -> short
        float f = 1500.99f;
        short s = (short) f;  // 1500 (дробная часть отбрасывается)
        System.out.println("(short) 1500.99f = " + s);

        // 5. char -> byte (небезопасно, теряется информация)
        char ch = 'Я';  // Unicode 1071
        byte b2 = (byte) ch;  // будет потеря данных
        System.out.println("(byte) 'Я' = " + b2);

        // 6. Проверка переполнения
        int maxInt = Integer.MAX_VALUE;
        System.out.println("Max int = " + maxInt);
        long asLong = (long) maxInt + 1;
        System.out.println("Max int + 1 as long = " + asLong);

        // Обратно в int (переполнение)
        int overflow = (int) (maxInt + 1L);
        System.out.println("Max int + 1 cast to int = " + overflow);  // Минимальное int
    }
}
