package com.examples.suppresswarnings;

import java.util.ArrayList;
import java.util.List;

public class LocalVariableExample {
    public static void main(String[] args) {
        @SuppressWarnings("rawtypes")
        List rawList = new ArrayList();  // Only this raw type is allowed

        List<String> properList = new ArrayList<String>();

        rawList.add("Test");
        properList.add("Test");

        System.out.println(rawList + " " + properList);
    }
}