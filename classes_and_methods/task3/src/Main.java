import com.examples.A;
import com.examples.B;

void main() {
    // 1. Через имя класса (рекомендуемый)
    System.out.print("1. Через имя класса: ");
    A.printVars();

    // 2. Через экземпляр класса
    System.out.print("2. Через экземпляр класса: ");
    A obj1 = new A();
    obj1.printVars();

    // 3. Через null-ссылку
    System.out.print("3. Через null-ссылку: ");
    A obj2 = null;
    obj2.printVars();

    // 4. Из статического метода того же класса
    System.out.print("4. ");
    A.staticMethodInSameClass();

    // 5. Из нестатического метода того же класса
    System.out.print("5. ");
    A obj3 = new A();
    obj3.instanceMethodInSameClass();

    // 6. Из наследника
    System.out.print("6. ");
    B.testInheritance();

    // 7. Из другого статического метода
    System.out.print("7. Из другого статического метода: ");
    testStatic();
}

public static void testStatic() {
    A.printVars();
}
