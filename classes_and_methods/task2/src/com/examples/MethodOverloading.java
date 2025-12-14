package com.examples;

public class MethodOverloading {
    public static void main(String[] args){
        MethodOverloading operation = new MethodOverloading();
        operation.mod(12,4);
        operation.mod(12.4,4.2);
    }

    void mod(double a, double b){
        System.out.println(a % b);
    }

    void mod(int a, int b){
        System.out.println(a % b);
    }
}
