package com.task005;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Hi. Enter four numbers...");
        int[] numArray = new int[4];
        int maxNum = numArray[0];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 4; i++) {
            try {
                int str = Integer.parseInt(reader.readLine());
                numArray[i] = str;

                if (numArray[i] > maxNum) {
                    maxNum = numArray[i];
                }
            } catch (Exception e) {
                System.out.println("Error! Enter a number. ");
                i--;
            }
        }

        System.out.println("Maximum number of : " + maxNum);
    }
}
