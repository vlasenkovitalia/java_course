public class Practice2 {
    class A {
        int a1;              // доступ по умолчанию (package-private)
        public int a2;       // публичный доступ
        protected int a3;    // защищенный доступ
        private int a4;      // приватный доступ

        void method1() { }        // доступ по умолчанию
        public void method2() { } // публичный метод
        protected void method3() { } // защищенный метод
        private void method4() { }   // приватный метод
    }

    class B extends A {
        // В классе B доступны:
        // a1 - только если B находится в том же пакете, что и A
        // a2 - всегда (public)
        // a3 - всегда (protected)
        // a4 - НЕ доступен (private)

        // method1() - только если B в том же пакете, что и A
        // method2() - всегда (public)
        // method3() - всегда (protected)
        // method4() - НЕ доступен (private)
    }

    class C extends B {
        // В классе C доступны:
        // a1 - только если C находится в том же пакете, что и A
        // a2 - всегда (public)
        // a3 - всегда (protected)
        // a4 - НЕ доступен (private) - приватные члены не наследуются!

        // method1() - только если C в том же пакете, что и A
        // method2() - всегда (public)
        // method3() - всегда (protected)
        // method4() - НЕ доступен (private)
    }
}
