package com.griesner.arrays;

import java.util.LinkedList;

public class TwoNumbers {
    public static void printN(double n) {
        System.out.println(n);
        if (n > 0) {
            TwoNumbers.printN(n - 1);
        }
    }
}
