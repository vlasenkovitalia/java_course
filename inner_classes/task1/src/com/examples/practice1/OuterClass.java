package com.examples.practice1;

public class OuterClass {
    // Внутренний класс с публичным доступом
    public class PublicInner {
        /* Доступен из любого другого класса, который может видеть OuterClass. */
        public String innerField = "Public Inner Field";
    }

    // Внутренний класс с защищенным доступом
    protected class ProtectedInner {
        /* Доступен в пределах пакета и в подклассах, даже если они находятся в других пакетах. */
        protected String innerField = "Protected Inner Field";
    }

    // Внутренний класс с приватным доступом
    private class PrivateInner {
        /* Доступен только внутри OuterClass */
        private String innerField = "Private Inner Field";
    }

    // Внутренний класс с доступом по умолчанию
    class DefaultInner {
        /* Доступен только внутри того же пакета, что и OuterClass */
        String innerField = "Default Inner Field";
    }
}
