package com.task025;

/**
 * 25. Implement a method that draws a rectangle of asterisks "*"
 * on the screen - its parameters will be integers that describe
 * the length and width of such a rectangle.
 */

public class Solution {
    public static void main(String[] args) {
        drawRectangle(5, 5);
    }

    public static void drawRectangle(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
