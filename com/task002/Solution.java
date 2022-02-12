package com.task002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Hi. Enter a five-digit number ...");

        while (true) {
            String number = reader.readLine();

            if (number.length() != 5) {
                System.out.println("Oops. The number must be in five digits. Try again. ");

            } else {
                char result[] = number.toCharArray();

                for (char c : result) {
                    System.out.println(c);
                }
                break;
            }
        }
    }
}
