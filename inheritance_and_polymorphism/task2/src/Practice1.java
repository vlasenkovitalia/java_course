static class SuperClass {
    // Объявляем метод как final
    public final void display() {
        IO.println("This is a final method in the superclass.");
    }
}

static class SubClass extends SuperClass {
    // Попытка переопределить final-метод вызовет ошибку компиляции
    /*
    @Override
    public void display() {
        System.out.println("Trying to override the final method.");
    }
    */
}


void main() {
    SuperClass superClass = new SuperClass();
    superClass.display();  // Вывод: This is a final method in the superclass.

    SubClass subClass = new SubClass();
    subClass.display();  // Вывод: This is a final method in the superclass.
}