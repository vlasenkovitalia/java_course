package datatypes;

public class ScopeExample {
    static void main(String[] args) {
        int a = 1;
        {
            int b = 2;  // b существует только в этом блоке {}
        }
        //int c = a + b;  // ошибка компиляции
        // Переменная b не видна за пределами своего блока
        // Компилятор выдаст: "cannot find symbol"
    }
}