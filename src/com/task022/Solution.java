package com.task022;

/**
 * 22. Write code to mirror the array (7,2,9,4) -> (4,9,2,7).
 * - The array can be of any length. (You can't use an additional
 * array when doing the task.)
 */

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] ints = {7, 2, 9, 4};

        for (int i = 0; i < ints.length / 2; i++) {
            int temp = ints[i];
            ints[i] = ints[ints.length - i - 1];
            ints[ints.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(ints));
    }
}
