package com.examples.suppresswarnings;
import java.util.ArrayList;
import java.util.List;

public class UncheckedExample {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List rawList = new ArrayList();
        rawList.add("Hello");
        rawList.add(123);  // This would normally generate unchecked warning

        // Casting to generic type
        List<String> stringList = (List<String>) rawList;  // Unchecked cast
        System.out.println(stringList.get(0));
    }
}
