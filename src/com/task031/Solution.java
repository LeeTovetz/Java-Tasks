package com.task031;

/**
 * 31. Write a program that returns the number of milliseconds
 * that have elapsed from the same number, but last month to
 * today's date. For example, if today is August 3,
 * find out how many milliseconds have passed since July 3.
 */

import java.util.Calendar;

public class Solution {
    public static void main(String[] args) {
        System.out.println(dateDifference());
    }

    private static long dateDifference() {
        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(Calendar.MONTH, -1);
        return calendar1.getTimeInMillis() - calendar2.getTimeInMillis();
    }
}
