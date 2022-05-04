package com.task036;

/**
 * 36. The Hamming distance between two binary numbers
 * is the number of positions where the bits differ.
 * Given two positive integers (M, M) in decimal form.
 * You need to calculate the Hamming distance between these two numbers.
 */

public class Solution {
    public static void main(String[] args) {
        int num1 = 1000, num2 = 17;
        System.out.println(hammingDistance(num1, num2));
    }

    static int hammingDistance(int num1, int num2) {
        int i = num1 ^ num2;
        int bits = 0;

        while (i > 0) {
            bits += i & 1;
            i >>= 1;
        }
        return bits;
    }
}
