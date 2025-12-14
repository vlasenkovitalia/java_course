package com.examples;

public class Practice2 {
    static void main(String[] args) {
        // Статический метод valueOf с примитивом
        Boolean b1 = Boolean.valueOf(true);
        Boolean b2 = Boolean.valueOf(false);

        // Статический метод valueOf со строкой:
        Boolean b3 = Boolean.valueOf("true"); // true (регистр неважен: "True", "TRUE" тоже сработают)
        Boolean b4 = Boolean.valueOf("false"); // false
        Boolean b5 = Boolean.valueOf("yes"); // false (любая строка, кроме "true" в любом регистре)

        // Автоупаковка
        Boolean bTrue = Boolean.TRUE;
        Boolean bFalse = Boolean.FALSE;

        // не рекомендуется использование конструктора (устарел)
    }
}
