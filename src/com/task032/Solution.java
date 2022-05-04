package com.task032;

/**
 * 32. Write your own variant of Arrays.toString() method for int[].
 */

public class Solution {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5};
        System.out.println(myToString(ints));
    }

    private static String myToString(int[] array) {
        StringBuilder builder = new StringBuilder("[");

        for (int i : array) {
            builder.append(i + ",");
        }

        builder.deleteCharAt(builder.length() - 1);
        builder.append("]");
        return builder.toString();
    }
}
