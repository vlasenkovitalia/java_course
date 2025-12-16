public class Practice2 {
    static class Animal {
        public void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    static class Dog extends Animal {
        @Override
        public void sound() {
            System.out.println("Dog barks");
        }
    }

    /*Если у переопределенного и переопределяемого методов не будет совпадать тип возвращаемого значения,
     это приведет к ошибке компиляции, если тип возвращаемого значения не является подклассом (или тем же типом),
     чем у метода суперкласса. */

    static class SupClass {
        public Number sound() {
            return 1;
        }
    }

    static class SubClass extends SupClass {
        /* @Override
        public String sound() { // Ошибка компиляции
            return "Dog barks";
        }*/
    }


}
