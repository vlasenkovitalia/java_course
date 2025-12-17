package com.examples;

public class StringConversionDemo {
    static void main(String[] args) {
        String str = "Hello World";
        StringBuffer stringBuffer = new StringBuffer("StringBuffer Example");
        StringBuilder stringBuilder = new StringBuilder("StringBuilder Example");

        System.out.println("1. Из String в StringBuffer и StringBuilder:");

        // String -> StringBuffer
        StringBuffer bufferFromString = new StringBuffer(str);
        System.out.println("   String -> StringBuffer: " + bufferFromString);

        // String -> StringBuilder
        StringBuilder builderFromString = new StringBuilder(str);
        System.out.println("   String -> StringBuilder: " + builderFromString);

        System.out.println("\n2. Из StringBuffer в String и StringBuilder:");

        // StringBuffer -> String
        String strFromBuffer = stringBuffer.toString();
        System.out.println("   StringBuffer -> String (toString()): " + strFromBuffer);

        // StringBuffer -> StringBuilder (через String)
        StringBuilder builderFromBuffer = new StringBuilder(stringBuffer.toString());
        System.out.println("   StringBuffer -> StringBuilder: " + builderFromBuffer);

        // StringBuffer.substring() -> String
        String subFromBuffer = stringBuffer.substring(0, 11);
        System.out.println("   StringBuffer.substring() -> String: " + subFromBuffer);

        System.out.println("\n3. Из StringBuilder в String и StringBuffer:");

        // StringBuilder -> String
        String strFromBuilder = stringBuilder.toString();
        System.out.println("   StringBuilder -> String (toString()): " + strFromBuilder);

        // StringBuilder -> StringBuffer (через String)
        StringBuffer bufferFromBuilder = new StringBuffer(stringBuilder.toString());
        System.out.println("   StringBuilder -> StringBuffer: " + bufferFromBuilder);

        // StringBuilder.substring() -> String
        String subFromBuilder = stringBuilder.substring(0, 12);
        System.out.println("   StringBuilder.substring() -> String: " + subFromBuilder);
    }
}