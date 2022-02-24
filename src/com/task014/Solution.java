package com.task014;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Enter a number between 4 and 16: ");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            long number = Integer.parseInt(reader.readLine());
            long result = 1;

            if (4 < number && number < 16) {
                for (long i = number; i >= 1; i--) {
                    result = result * i;
                }
                System.out.println(result);
            }

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
