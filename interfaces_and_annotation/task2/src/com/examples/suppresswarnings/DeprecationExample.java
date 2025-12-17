package com.examples.suppresswarnings;

class OldClass {
    @Deprecated
    public void oldMethod() {
        System.out.println("This method is deprecated");
    }
}

public class DeprecationExample {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        OldClass obj = new OldClass();
        obj.oldMethod();  // Normally generates deprecation warning
    }
}