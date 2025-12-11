package com.example;

/**
 * Утилитарный класс для выполнения математических операций.
 * Все методы класса являются статическими.
 *
 * @author Виталия Власенко
 * @version 1.1
 * @since 1.0
 */
public class Calculator {

    /**
     * Складывает два числа.
     *
     * @param a первое слагаемое
     * @param b второе слагаемое
     * @return сумма a и b
     */
    public static double add(double a, double b) {
        return a + b;
    }

    /**
     * Вычитает второе число из первого.
     *
     * @param a уменьшаемое
     * @param b вычитаемое
     * @return разность a и b
     */
    public static double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Умножает два числа.
     *
     * @param a первый множитель
     * @param b второй множитель
     * @return произведение a и b
     */
    public static double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Делит первое число на второе.
     *
     * @param a делимое
     * @param b делитель
     * @return частное a и b
     * @throws ArithmeticException если делитель равен нулю
     * @see #validateDivisor(double)
     */
    public static double divide(double a, double b) {
        validateDivisor(b);
        return a / b;
    }

    /**
     * Проверяет, что делитель не равен нулю.
     *
     * @param divisor проверяемый делитель
     * @throws ArithmeticException если делитель равен нулю
     */
    private static void validateDivisor(double divisor) {
        if (Math.abs(divisor) < 1e-10) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
    }

    /**
     * Вычисляет факториал числа.
     *
     * @param n число для вычисления факториала
     * @return факториал числа n
     * @throws IllegalArgumentException если n отрицательное
     * @deprecated используйте {@link #factorialRecursive(int)} для наглядности
     *             или {@link #factorialIterative(int)} для эффективности
     */
    @Deprecated(since = "1.2", forRemoval = false)
    public static long factorial(int n) {
        return factorialIterative(n);
    }

    /**
     * Вычисляет факториал итеративным способом.
     * Более эффективный метод, чем рекурсивный.
     *
     * @param n число для вычисления факториала
     * @return факториал числа n
     * @throws IllegalArgumentException если n отрицательное
     * @see #factorialRecursive(int)
     */
    public static long factorialIterative(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал определен только для неотрицательных чисел");
        }

        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * Вычисляет факториал рекурсивным способом.
     * Наглядный, но менее эффективный метод.
     *
     * @param n число для вычисления факториала
     * @return факториал числа n
     * @throws IllegalArgumentException если n отрицательное
     * @see #factorialIterative(int)
     */
    public static long factorialRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал определен только для неотрицательных чисел");
        }
        if (n <= 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    /**
     * Возведение числа в степень.
     * Поддерживает как положительные, так и отрицательные степени.
     *
     * @param base     основание
     * @param exponent показатель степени
     * @return base в степени exponent
     * @see Math#pow(double, double)
     */
    public static double power(double base, int exponent) {
        return Math.pow(base, exponent);
    }
}