void main() {
    // базовые типы и их обертки
    // int
    int value = 2;
    switch(value) {
        case 1: System.out.println("one"); break;
        case 2: System.out.println("two"); break;
    }

    // char
    char grade = 'B';
    switch(grade) {
        case 'A': System.out.println("5"); break;
        case 'B': System.out.println("4"); break;
    }

    // Byte (обёртка)
    Byte b = 10;
    switch(b) {
        case 10: System.out.println("ten"); break;
    }

    // строки
    String day = "MONDAY";
    switch(day) {
        case "MONDAY":
            System.out.println("Понедельник");
            break;
        case "TUESDAY":
            System.out.println("Вторник");
            break;
    }


    // перечисления
    enum Color { RED, GREEN, BLUE }

    Color color = Color.RED;
    switch(color) {
        case RED:
            System.out.println("Красный");
            break;
        case GREEN:
            System.out.println("Зелёный");
            break;
    }
}
