package com.task024;

/**
 * 24. Implement a method whose parameters are an integer,
 * a real number, and a string. It returns the concatenation of
 * a string with the sum of a real and an integer.
 */

public class Solution {
    public static void main(String[] args) {
        System.out.println(getConcat("Hello", 3, 4.5));
    }

    public static String getConcat(String s, int a, double c) {
        return s + " " + (a + c);
    }
}
