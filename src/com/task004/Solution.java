package com.task004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the length of the radius = ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double radius = Double.parseDouble(reader.readLine());
        double perimeter = 2.0 * Math.PI * radius;
        System.out.println("Length of a circle (perimeter of a circle) with a radius  " + radius + " is " + perimeter);
    }
}
