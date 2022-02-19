package com.task011;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        int[] luck = new int[4];

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter a four-digit number: ");
            char[] chars = reader.readLine().toCharArray();

            if (chars.length != 4) {
                System.out.println("Error! Enter a four-digit number");
            } else {
                for (int i = 0; i < chars.length; i++) {
                    luck[i] = Integer.parseInt(String.valueOf(chars[i]));
                }
                boolean luckyTicket = luck[0] + luck[1] == luck[2] + luck[3];

                System.out.println("Number " + String.valueOf(chars)
                        + (luckyTicket ? " is a lucky" : " is not a happy") + " ticket." );
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error! Enter a number.");
        }
    }
}
