// метод 1: суммирование целых чисел
public static int sum(int... numbers) {
    int result = 0;
    for (int num : numbers) {
        result += num;
    }
    return result;
}

// метод 2: суммирование вещественных чисел
public static double sum(double... numbers) {
    double result = 0.0;
    for (double num : numbers) {
        result += num;
    }
    return result;
}

void main(String[] args) {
    System.out.println("Сумма целых: " + sum(1, 2, 3, 4, 5));
    System.out.println("Сумма вещественных: " + sum(1.5, 2.5, 3.5));
}