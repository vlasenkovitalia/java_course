package com.examples.suppresswarnings;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all")
public class AllWarningsExample {
    private static java.util.Date date;  // Unused field warning suppressed

    public static void main(String[] args) {
        List list = new ArrayList();  // Raw type warning suppressed
        list.add("Test");

        @SuppressWarnings("all")
        int unused = 42;  // Unused variable warning suppressed

        System.out.println(list);
    }
}