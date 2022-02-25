package com.task016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Rectangle height: ");
        int height = Integer.parseInt(reader.readLine());

        System.out.println("Rectangle width: ");
        int width = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("♝");
            }
            System.out.println(" ");
        }
    }
}
