package com.examples;

public class Practice1 {
    public static void main(String[] args) {
        // Базовые типы
        int a = 10, b = 3;
        boolean x = true, y = false;
        double d1 = 5.5, d2 = 2.0;

        System.out.println("Исходные значения: a = " + a + ", b = " + b +
                ", x = " + x + ", y = " + y +
                ", d1 = " + d1 + ", d2 = " + d2 + "\n");

        int result = a;
        System.out.println("1. Присваивание: result = a");
        System.out.println("   result = " + result);

        a += 5;
        System.out.println("\n2. a += 5");
        System.out.println("   a = " + a);

        a -= 2;
        System.out.println("\n3. a -= 2");
        System.out.println("   a = " + a);

        a *= 2;
        System.out.println("\n4. a *= 2");
        System.out.println("   a = " + a);

        a /= 4;
        System.out.println("\n5. a /= 4");
        System.out.println("   a = " + a);

        a %= 4;
        System.out.println("\n6. a %= 4");
        System.out.println("   a = " + a);

        int max = (a > b) ? a : b;
        System.out.println("\n7. Тернарный оператор: max = (a > b) ? a : b");
        System.out.println("   max = " + max + " (a = " + a + ", b = " + b + ")");

        boolean orResult = x || y;
        System.out.println("\n8. Логическое ИЛИ: x || y");
        System.out.println("   " + x + " || " + y + " = " + orResult);

        boolean andResult = x && y;
        System.out.println("\n9. Логическое И: x && y");
        System.out.println("   " + x + " && " + y + " = " + andResult);

        int bitOr = 5 | 3;
        System.out.println("\n10. Побитовое ИЛИ: 5 | 3");
        System.out.println("    0101 | 0011 = 0111 = " + bitOr);

        int bitXor = 5 ^ 3;
        System.out.println("\n11. Побитовое XOR: 5 ^ 3");
        System.out.println("    0101 ^ 0011 = 0110 = " + bitXor);

        int bitAnd = 5 & 3;
        System.out.println("\n12. Побитовое И: 5 & 3");
        System.out.println("    0101 & 0011 = 0001 = " + bitAnd);

        boolean isEqual = (a == b);
        boolean notEqual = (a != b);
        System.out.println("\n13. Равенство: a == b");
        System.out.println("    " + a + " == " + b + " = " + isEqual);
        System.out.println("\n14. Неравенство: a != b");
        System.out.println("    " + a + " != " + b + " = " + notEqual);

        boolean greater = (a > b);
        boolean greaterOrEqual = (a >= 2);
        System.out.println("\n15. Больше: a > b");
        System.out.println("    " + a + " > " + b + " = " + greater);
        System.out.println("\n16. Больше или равно: a >= 2");
        System.out.println("    " + a + " >= 2 = " + greaterOrEqual);

        int shiftRight = 8 >> 1;
        int shiftLeft = 2 << 2;
        int unsignedShift = -8 >>> 1;
        System.out.println("\n17. Сдвиг вправо: 8 >> 1");
        System.out.println("    1000 >> 1 = 0100 = " + shiftRight);
        System.out.println("\n18. Сдвиг влево: 2 << 2");
        System.out.println("    0010 << 2 = 1000 = " + shiftLeft);
        System.out.println("\n19. Беззнаковый сдвиг вправо: -8 >>> 1");
        System.out.println("    -8 >>> 1 = " + unsignedShift);

        int sum = a + b;
        int diff = a - b;
        System.out.println("\n20. Сложение: a + b");
        System.out.println("    " + a + " + " + b + " = " + sum);
        System.out.println("\n21. Вычитание: a - b");
        System.out.println("    " + a + " - " + b + " = " + diff);

        int product = a * b;
        int quotient = b / a;
        double preciseQuotient = d1 / d2;
        int remainder = b % a;
        System.out.println("\n22. Умножение: a * b");
        System.out.println("    " + a + " * " + b + " = " + product);
        System.out.println("\n23. Целочисленное деление: b / a");
        System.out.println("    " + b + " / " + a + " = " + quotient);
        System.out.println("\n24. Деление с плавающей точкой: d1 / d2");
        System.out.println("    " + d1 + " / " + d2 + " = " + preciseQuotient);
        System.out.println("\n25. Остаток от деления: b % a");
        System.out.println("    " + b + " % " + a + " = " + remainder);

        a = 2; b = 3;

        System.out.println("\n26. Префиксный инкремент: ++a");
        System.out.println("    До: a = " + a);
        int preIncrement = ++a;
        System.out.println("    После ++a: a = " + a + ", preIncrement = " + preIncrement);

        System.out.println("\n27. Постфиксный инкремент: a++");
        System.out.println("    До: a = " + a);
        int postIncrement = a++;
        System.out.println("    После a++: a = " + a + ", postIncrement = " + postIncrement);

        System.out.println("\n28. Префиксный декремент: --b");
        System.out.println("    До: b = " + b);
        int preDecrement = --b;
        System.out.println("    После --b: b = " + b + ", preDecrement = " + preDecrement);

        System.out.println("\n29. Постфиксный декремент: b--");
        System.out.println("    До: b = " + b);
        int postDecrement = b--;
        System.out.println("    После b--: b = " + b + ", postDecrement = " + postDecrement);

        int bitNot = ~5;
        System.out.println("\n30. Побитовое НЕ: ~5");
        System.out.println("    ~0101 = ...11111010 = " + bitNot);

        boolean notX = !x;
        System.out.println("\n31. Логическое НЕ: !x");
        System.out.println("    !" + x + " = " + notX);

        int withoutParentheses = 2 + 3 * 4;
        int withParentheses = (2 + 3) * 4;
        System.out.println("\n32. Приоритет операторов: скобки изменяют порядок");
        System.out.println("    Без скобок: 2 + 3 * 4 = " + withoutParentheses);
        System.out.println("    Со скобками: (2 + 3) * 4 = " + withParentheses);

        int[] array = {1, 2, 3};
        int firstElement = array[0];
        System.out.println("\n33. Доступ к элементу массива: array[0]");
        System.out.println("    array = {1, 2, 3}, array[0] = " + firstElement);
    }
}