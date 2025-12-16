package com.examples;

public class Practice2 {
    // Перечисление с абстрактным методом
    public enum Operation {
        PLUS("+") {
            public double apply(double x, double y) {
                return x + y;
            }
        },
        MINUS("-") {
            public double apply(double x, double y) {
                return x - y;
            }
        },
        TIMES("*") {
            public double apply(double x, double y) {
                return x * y;
            }
        },
        DIVIDE("/") {
            public double apply(double x, double y) {
                if (y == 0) {
                    throw new ArithmeticException("Деление на ноль!");
                }
                return x / y;
            }
        },
        POWER("^") {
            public double apply(double x, double y) {
                return Math.pow(x, y);
            }
        },
        MODULO("%") {
            public double apply(double x, double y) {
                return x % y;
            }
        };

        private final String symbol;

        Operation(String symbol) {
            this.symbol = symbol;
        }

        // Абстрактный метод (должен быть реализован каждым элементом)
        public abstract double apply(double x, double y);

        // Общий метод для всех элементов
        public String getSymbol() {
            return symbol;
        }

        // Статический метод для поиска по символу
        public static Operation fromSymbol(String symbol) {
            for (Operation op : values()) {
                if (op.symbol.equals(symbol)) {
                    return op;
                }
            }
            throw new IllegalArgumentException("Неизвестная операция: " + symbol);
        }

        // Метод для выполнения операции с выводом результата
        public void calculateAndPrint(double x, double y) {
            try {
                double result = apply(x, y);
                System.out.printf("%.2f %s %.2f = %.2f%n", x, symbol, y, result);
            } catch (ArithmeticException e) {
                System.out.printf("Ошибка: %s%n", e.getMessage());
            }
        }
    }

    static void main(String[] args) {
        double a = 10.0;
        double b = 3.0;

        // Использование всех операций
        for (Operation op : Operation.values()) {
            op.calculateAndPrint(a, b);
        }

        // Поиск операции по символу
        Operation foundOp = Operation.fromSymbol("*");
        System.out.println("\nНайденная операция: " + foundOp);
        System.out.println("Результат: " + foundOp.apply(5, 4));
    }
}
