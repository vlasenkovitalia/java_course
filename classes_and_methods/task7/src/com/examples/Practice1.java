package com.examples;

public class Practice1 {
    static void main(String[] args) {
        Wrapper<Integer> intWrapper = new Wrapper<>();
        Wrapper<String> stringWrapper = new Wrapper<>();

        // правильно: проверяем raw type
        System.out.println("intWrapper instanceof Wrapper: " + (intWrapper instanceof Wrapper));
        System.out.println("stringWrapper instanceof Wrapper: " + (stringWrapper instanceof Wrapper));

        // неправильно: на самом деле здесь игнорируется <Integer> и проверяется только instanceof Wrapper
        System.out.println(intWrapper instanceof Wrapper<Integer>);
    }
}
