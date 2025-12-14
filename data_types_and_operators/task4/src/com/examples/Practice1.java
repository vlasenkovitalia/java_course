package com.examples;

public class Practice1 {
    static void main(String[] args) {
        Integer dec = Integer.decode("100");
        System.out.println("Decimal decode: " + dec); // Output: 100

        Integer hex = Integer.decode("0xFF");
        System.out.println("Hexadecimal decode: " + hex); // Output: 255

        Integer oct = Integer.decode("010");
        System.out.println("Octal decode: " + oct); // Output: 8

        Integer signedHex = Integer.decode("-0x42");
        System.out.println("Signed Hexadecimal decode: " + signedHex); // Output: -66
    }
}
