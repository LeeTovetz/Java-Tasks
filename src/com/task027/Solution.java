package com.task027;

/**
 * 27. Write a method that returns the number of words in a line of text.
 */

public class Solution {
    public static void main(String[] args) {
        String str = "Lorem ipsum dolor sit amet consectetur adipiscing elit";
        System.out.println(countWords(str));
    }

    private static int countWords(String text) {
        String[] strings = text.trim().split("\\s+");
        return strings.length;
    }
}
