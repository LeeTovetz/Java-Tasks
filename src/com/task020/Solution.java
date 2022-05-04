package com.task020;

import java.util.Arrays;

/**
 * 20. Create an array of random numbers (size 15 elements).
 * Create a second array twice as big, the first 15 elements should be equal
 * to the elements of the first array, and fill the remaining elements with
 * the doubled value of the initial ones. For example There was - {1,4,7,2}
 * There was - {1,4,7,2,2,8,14,4}
 */
public class Solution {
    public static void main(String[] args) {
        int[] ints1 = new int[15];

        for (int i = 0; i < ints1.length; i++) {
            ints1[i] = (int) (Math.random() * 15);
        }
        System.out.println(Arrays.toString(ints1));

        int[] ints2 = Arrays.copyOf(ints1, 30);

        for (int i = 0; i < 15; i++) {
            ints2[i + 15] = ints2[i] * 2;
        }
        System.out.println(Arrays.toString(ints2));
    }
}
