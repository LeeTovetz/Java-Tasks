package com.task023;

/**
 * 23. Write a method that returns the maximum number of an array of integers.
 */

public class Solution {
    public static void main(String[] args) {
        int[] array = {1, 5, 6, 54, 9, 3, 2, 8, 44, 22};
        System.out.println(getMax(array));
    }

    public static int getMax(int[] array) {
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        return max;
    }
}
