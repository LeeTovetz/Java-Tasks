package com.task021;

/**
 * 21. Enter a string of text from the keyboard - implement a program to be able
 * to count the number of character - 'b' in this string,
 * with the result displayed on the screen.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        int count = 0;

        System.out.println("Enter a line of text:");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            char[] chars = reader.readLine().toCharArray();

            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == 'b') {
                    count++;
                }
            }
            System.out.println("Number of characters b: " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

