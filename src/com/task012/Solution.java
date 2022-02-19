package com.task012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter a six-digit number: ");
            String palindrome = reader.readLine();

            if (palindrome.length() != 6) {
                System.out.println("Error! Enter a six-digit number.");

            } else {
                boolean isPalindrome = palindrome.equals(new StringBuffer(palindrome).reverse().toString());
                System.out.println("The number " + palindrome + (isPalindrome ? " is a palindrome." : " is not a palindrome."));

            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error! Enter a number.");
        }
    }
}
