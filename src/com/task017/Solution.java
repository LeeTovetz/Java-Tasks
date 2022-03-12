package com.task017;

public class Solution {
    public static void main(String[] args) {
        boolean prime;

        for (int i = 2; i < 100; i++) {
            prime = true;

            for (int j = 2; j <= i / j; j++) {
                if (i % j == 0) {
                    prime = false;
                }
            }
            if (prime) {
                System.out.print(i + " ");
            }
        }
    }
}
