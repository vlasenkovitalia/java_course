public class Practice1 {
//          Ключевое слово this:

// 1. Ссылка на текущий объект - используется для обращения к полям и методам текущего класса

// 2. Вызов конструктора текущего класса - this(параметры) должен быть первым оператором в конструкторе

// 3. Разрешение конфликтов имен - когда параметры метода/конструктора имеют те же имена, что и поля класса

    class Parent1 {
        void method() {
            System.out.println("Метод суперкласса");
        }
    }

    class Child1 extends Parent1 {
        private int value;

        public Child1(int value) {
            this.value = value; // this различает поле класса и параметр
        }

        void method() {
            System.out.println("Метод подкласса");
        }

        void display() {
            System.out.println("Child value: " + this.value); // обращение к полю текущего класса
            this.method(); // вызов метода текущего класса
        }
    }

//          Ключевое слово super:

// 1. Вызов конструктора суперкласса - super(параметры) должен быть первым оператором в конструкторе подкласса

// 2. Доступ к методам суперкласса - когда метод переопределен в подклассе

// 3. Доступ к полям суперкласса - когда поля скрыты полями подкласса с тем же именем

    class Parent2 {
        int someField;

        // Конструктор по умолчанию
        Parent2() {
            System.out.println("Конструктор Parent2 без параметров");
        }

        // Конструктор с параметром
        Parent2(int value) {
            this.someField = value;
            System.out.println("Конструктор Parent2 с параметром: " + value);
        }

        void method() {
            System.out.println("Метод суперкласса");
        }
    }

    class Child2 extends Parent2 {
        private int value;

        // Конструктор 1: с двумя параметрами
        public Child2(int parentValue, int childValue) {
            super(parentValue); // вызов конструктора родительского класса с параметром
            this.value = childValue;
            System.out.println("Конструктор Child2 с параметрами: parent=" + parentValue + ", child=" + childValue);
        }

        // Конструктор 2: без параметров (вызывает конструктор по умолчанию родителя)
        public Child2() {
            super(); // вызов конструктора родительского класса без параметров (можно опустить)
            this.value = 0;
            System.out.println("Конструктор Child2 без параметров");
        }

        @Override
        void method() {
            super.method(); // вызов метода родительского класса
            System.out.println("Дополнительная логика в подклассе");
        }

        void display() {
            System.out.println("Parent field: " + super.someField); // доступ к полю суперкласса
            System.out.println("Child field: " + this.value); // доступ к полю текущего класса
        }
    }
}