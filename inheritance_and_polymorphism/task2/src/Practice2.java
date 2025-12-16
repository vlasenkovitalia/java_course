// Объявляем класс как final
static final class FinalClass {
    public void show() {
        IO.println("This is a final class.");
    }
}

// Попытка создать подкласс вызовет ошибку компиляции
    /*
    class SubClass extends FinalClass {
        // Код не будет компилироваться
    }
    */

void main() {
    FinalClass finalClass = new FinalClass();
    finalClass.show();  // Вывод: This is a final class.
}
