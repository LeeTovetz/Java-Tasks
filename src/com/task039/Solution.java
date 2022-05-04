package com.task039;

import java.io.File;

/**
 * 39. Implement a method that will display a list of all
 * directories that "lie" in the directory which will be
 * the parameter of this method.
 */

public class Solution {
    public static void main(String[] args) {
        File folder = new File("C:/homework");
        getFolders(folder);
    }

    public static void getFolders(File folder) {
        File[] folders = folder.listFiles();

        for (File files : folders) {
            if (files.isDirectory()) {
                System.out.println(files.getName());
                getFolders(files);
            }
        }
    }
}

