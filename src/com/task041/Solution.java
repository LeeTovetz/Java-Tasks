package com.task041;

/**
 * 41. Write a method for creating an ASCII-art in a file,
 * i.e. a 40x40 character figure filled with characters
 * that form a pattern.
 */

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        File file = new File("ascii-art.txt");
        addToFile(file);
    }

    public static void addToFile(File file) {
        String string = "       _                        \n" +
                "       \\`*-.                    \n" +
                "        )  _`-.                 \n" +
                "       .  : `. .                \n" +
                "       : _   '  \\               \n" +
                "       ; *` _.   `*-._          \n" +
                "       `-.-'          `-.       \n" +
                "         ;       `       `.     \n" +
                "         :.       .        \\    \n" +
                "         . \\  .   :   .-'   .   \n" +
                "         '  `+.;  ;  '      :   \n" +
                "         :  '  |    ;       ;-. \n" +
                "         ; '   : :`-:     _.`* ;\n" +
                "[bug] .*' /  .*' ; .*`- +'  `*' \n" +
                "      `*-*   `*-*  `*-*'";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(string);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
