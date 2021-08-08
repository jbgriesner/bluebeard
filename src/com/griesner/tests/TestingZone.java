package com.griesner.tests;

import java.util.Collection;

public class TestingZone {
    public static void print(Collection<Integer> C, Predicate<Integer> p) {
        for (Integer x : C) {
            if (p.test(x)) {
                System.out.println(x + " ");
            }
        }
    }
}