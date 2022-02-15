package com.task007;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Enter the year: ");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int year = Integer.parseInt(reader.readLine());

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Number of days in the year: " + 366);
            } else {
                System.out.println("Number of days in the year: " + 365);
            }

        } catch (IOException | NumberFormatException e) {
            System.out.println("Error! You entered the wrong year.");
        }
    }
}
