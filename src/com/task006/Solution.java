package com.task006;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        System.out.println(" Type the apartment number: ");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int roomNum = Integer.parseInt(reader.readLine());
            int floorHouse = (int) Math.ceil(roomNum / 4);

            if ((roomNum > 0) && (roomNum <= 36)) {
                System.out.println("1st entrance " + floorHouse + " floor");
            } else if ((roomNum > 36) && (roomNum <= 72)) {
                System.out.println("2 entrance " + (floorHouse - 9) + " floor");
            } else if ((roomNum > 72) && (roomNum <= 108)) {
                System.out.println("3rd entrance " + (floorHouse - 18) + " floor");
            } else if ((roomNum > 108) && (roomNum <= 144)) {
                System.out.println("4th entrance " + (floorHouse - 27) + " floor");
            } else {
                System.out.println(" There is no such apartment.");
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println(" There is no such apartment.");
        }
    }
}
