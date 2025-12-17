package com.examples;

public class StringBufferBuilderDemo {
    static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");
        StringBuilder stringBuilder = new StringBuilder("Hello");

        System.out.println("=== StringBuffer ===");
        System.out.println("Исходная строка: " + stringBuffer);

        // 1. append() - добавляет строку в конец
        stringBuffer.append(" World");
        System.out.println("1. append(' World'): " + stringBuffer);

        // 2. insert() - вставляет строку в указанную позицию
        stringBuffer.insert(5, ",");
        System.out.println("2. insert(5, ','): " + stringBuffer);

        // 3. delete() - удаляет символы в указанном диапазоне
        stringBuffer.delete(5, 12);
        System.out.println("3. delete(5, 12): " + stringBuffer);

        // 4. deleteCharAt() - удаляет символ по указанному индексу
        stringBuffer.deleteCharAt(4);
        System.out.println("4. deleteCharAt(4): " + stringBuffer);

        // 5. replace() - заменяет символы в указанном диапазоне
        stringBuffer.replace(0, 5, "Hi");
        System.out.println("5. replace(0, 5, 'Hi'): " + stringBuffer);

        // 6. reverse() - переворачивает строку
        stringBuffer.reverse();
        System.out.println("6. reverse(): " + stringBuffer);
        stringBuffer.reverse(); // возвращаем обратно

        // 7. capacity() - возвращает текущую вместимость буфера
        System.out.println("7. capacity(): " + stringBuffer.capacity());

        // 8. ensureCapacity() - гарантирует минимальную вместимость
        stringBuffer.ensureCapacity(50);
        System.out.println("8. ensureCapacity(50): capacity = " + stringBuffer.capacity());

        // 9. setLength() - устанавливает новую длину строки
        stringBuffer.setLength(10);
        System.out.println("9. setLength(10): '" + stringBuffer + "' (длина: " + stringBuffer.length() + ")");

        // 10. substring() - возвращает часть строки
        String sub = stringBuffer.substring(0, 2);
        System.out.println("10. substring(0, 2): " + sub);

        System.out.println("\n=== StringBuilder ===");
        System.out.println("Исходная строка: " + stringBuilder);

        stringBuilder.append(" Java");
        System.out.println("append(' Java'): " + stringBuilder);

        stringBuilder.insert(6, "Awesome ");
        System.out.println("insert(6, 'Awesome '): " + stringBuilder);

        stringBuilder.delete(6, 14);
        System.out.println("delete(6, 14): " + stringBuilder);

        // 11. charAt() - возвращает символ по индексу
        System.out.println("11. charAt(6): " + stringBuilder.charAt(6));

        // 12. indexOf() - возвращает индекс первого вхождения подстроки
        System.out.println("12. indexOf('Java'): " + stringBuilder.indexOf("Java"));

        // 13. lastIndexOf() - возвращает индекс последнего вхождения
        stringBuilder.append(" Java");
        System.out.println("13. lastIndexOf('Java'): " + stringBuilder.lastIndexOf("Java"));

        // 14. setCharAt() - устанавливает символ по указанному индексу
        stringBuilder.setCharAt(0, 'h');
        System.out.println("14. setCharAt(0, 'h'): " + stringBuilder);

        // 15. trimToSize() - уменьшает емкость до текущей длины
        System.out.println("До trimToSize(): capacity = " + stringBuilder.capacity() +
                ", length = " + stringBuilder.length());
        stringBuilder.trimToSize();
        System.out.println("15. После trimToSize(): capacity = " + stringBuilder.capacity());
    }
}