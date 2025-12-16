public class InitializeFinal {
    // Способ 1: Инициализация при объявлении
    public final int option1 = 1;

    // Способ 2: Инициализация в блоке
    public final int option2;
    {
        option2 = 2;
    }

    // Способ 3: Инициализация в конструкторе
    public final int option3;

    public InitializeFinal() {
        option3 = 3;
    }

    public InitializeFinal(int customValue) {
        option3 = customValue;
    }

    public static void main(String[] args) {
        InitializeFinal ex1 = new InitializeFinal();
        System.out.println("ex1: " + ex1.option1 + ", " + ex1.option2 + ", " + ex1.option3);

        InitializeFinal ex2 = new InitializeFinal(99);
        System.out.println("ex2: " + ex2.option1 + ", " + ex2.option2 + ", " + ex2.option3);
    }
}