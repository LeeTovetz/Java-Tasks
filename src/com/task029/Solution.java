package com.task029;

/**
 * 29. A palindrome number reads the same on both
 * sides (right to left and left to right).
 * The largest palindrome number obtained by multiplying
 * two two two-digit numbers is -9009 = 91 x 99.
 * Find the largest palindrome obtained by multiplying two three-digit numbers.
 */

public class Solution {
    public static void main(String[] args) {
        int sum;
        int max = 0;

        for (int i = 999; i > 0; i--) {
            for (int j = 999; j > 0; j--) {
                sum = i * j;
                String s = Integer.toString(sum);

                if (s.equals(new StringBuilder(s).reverse().toString())) {
                    max = Math.max(max, sum);
                }
            }
        }
        System.out.println("The largest palindrome obtained by multiplying two three-digit numbers : " + max);
    }
}
