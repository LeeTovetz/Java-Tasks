package com.task035;

/**
 * 35. Enter the date from the console. Compare it with the current
 * date in the system. Print the different parts (year, month)
 * on the screen.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the date in the format dd MM yyyy : ");
            getDate(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getDate(String text) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
            Date currentDate = new Date();
            Date enteredDate = sdf.parse(text);
            int yearDifference = currentDate.getYear() - enteredDate.getYear();

            if (yearDifference == 0) {
                stringBuilder.append("The year matches");
            } else {
                stringBuilder.append("The year is different on: " + yearDifference);
            }

            stringBuilder.append(" and ");

            int mounthDifference = currentDate.getMonth() - enteredDate.getMonth();

            if (mounthDifference == 0) {
                stringBuilder.append("month matches.");
            } else {
                stringBuilder.append("month is different by: " + mounthDifference);
            }
            System.out.println(stringBuilder);
        } catch (ParseException e) {
            System.out.println("Error! You entered an incorrect date.");
        }
    }
}