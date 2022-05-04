package com.task034;

/**
 * 34. Print 10 lines with the value of pi on the screen.
 * The first line should have 2 decimal places, the second 3,
 * the third 4, etc.
 */

public class Solution {
    public static void main(String[] args) {
        tenPiNum(Math.PI);
    }

    private static void tenPiNum(double num) {
        for (int i = 2; i < 12; i++) {
            System.out.printf("%." + i + "f" + "\n", num);
        }
    }
}