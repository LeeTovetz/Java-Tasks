package com.task019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Enter the array size: ");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            try {
                int arrayLenght = Integer.parseInt(reader.readLine());
                int[] numArray = new int[arrayLenght];

                System.out.println("Fill in the array of integers: ");
                for (int i = 0; i < numArray.length; i++) {
                    numArray[i] = Integer.parseInt(reader.readLine());
                }
                System.out.println(Arrays.toString(numArray));
            } catch (NumberFormatException e) {
                System.out.println("Error! Enter an integer.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
