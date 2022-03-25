package com.task018;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 5, 2, 4, 7, 1, 3, 19};
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
