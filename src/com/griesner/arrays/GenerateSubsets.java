package com.griesner.arrays;

public class GenerateSubsets {

    public static void generate(String s, String curString, int i) {
        if (i == s.length()) {
            System.out.println(curString);
            return;
        }
        generate(s, curString, i + 1);
        generate(s, curString + s.charAt(i), i + 1);
    }
}
