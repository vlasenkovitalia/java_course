package com.examples.suppresswarnings;

import java.util.ArrayList;
import java.util.List;

public class MultipleWarningsExample {

    @SuppressWarnings({"unchecked", "deprecation", "rawtypes"})
    public static void main(String[] args) {
        // Raw type usage
        List rawList = new ArrayList();

        // Unchecked operation
        rawList.add("Test");

        System.out.println("Operation completed with suppressed warnings");
    }
}