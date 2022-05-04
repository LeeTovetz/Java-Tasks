package com.task033;

/**
 * 33. Enter a number in binary format from the console.
 * Convert it to decimal and display it on the screen ("10" -> 2).
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter a number in binary format (for example: 0101) : ");
            String str = reader.readLine();

            System.out.println(toDecimal(str));
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    static int toDecimal(String text) {
        return Integer.parseInt(text, 2);
    }
}