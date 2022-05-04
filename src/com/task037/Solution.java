package com.task037;

import java.io.*;

/**
 * 37. Create a console "text editor" with the ability to save typed text to a file.
 */

public class Solution {
    public static void main(String[] args) {
        File file = new File("a.txt");
        textEditor(file);
    }

    private static void textEditor(File file) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            StringBuilder stringBuilder = new StringBuilder();
            String string;

            while (!(string = reader.readLine()).equals("exit")) {
                stringBuilder.append(string);
                stringBuilder.append(System.lineSeparator());
            }
            writer.write(stringBuilder.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
