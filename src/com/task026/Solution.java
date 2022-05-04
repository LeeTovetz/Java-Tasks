package com.task026;

/**
 * 26. Write a method that implements a linear search for an element
 * in an array of integers. If there is such an element in the array
 * then return its index, if not then the method should return number - "-1".
 */

public class Solution {
    public static void main(String[] args) {
        int[] intsArray = {1, 5, 6, 54, 9, 3, 2, 8, 44};
        int num = 44;
        System.out.println(findElement(intsArray, num));
    }

    public static int findElement(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }
}


