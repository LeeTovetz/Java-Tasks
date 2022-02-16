package com.task009;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        double r = 4;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the coordinate of point X: ");
            double x = Double.parseDouble(reader.readLine());

            System.out.println("Enter the coordinate of the Y point: ");
            double y = Double.parseDouble(reader.readLine());
            double h = Math.sqrt((x * x) + (y * y));

            System.out.println("Coordinates of point X and Y " + (h > r ? "are not inside the circle. " : " lie inside the circle. "));
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error! Enter a number.");
        }
    }
}
