package com.task008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Type side A of the triangle: ");
            double aSide = Double.parseDouble(reader.readLine());

            System.out.println("Type side B of the triangle: ");
            double bSide = Double.parseDouble(reader.readLine());

            System.out.println("Type side C of the triangle: ");
            double cSide = Double.parseDouble(reader.readLine());

            boolean triangle = (aSide + bSide) > cSide && (aSide + cSide) > bSide && (bSide + cSide) > aSide;

            System.out.println("\n" + (triangle ? "This triangle exists!" : "This triangle does not exist!"));

        } catch (IOException | NumberFormatException e) {
            System.out.println("Error! Enter a number.");
        }
    }
}
