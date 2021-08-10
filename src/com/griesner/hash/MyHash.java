package com.griesner.hash;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyHash {
    int BUCKET;
    ArrayList<LinkedList<Integer>> table;

    public MyHash(int b) {
        this.BUCKET = b;
        table = new ArrayList<LinkedList<Integer>>();
        for (int i = 0; i < b; i++) {
            table.add(new LinkedList<Integer>());
        }
    }

    public void insert(int key) {
        int i = key % this.BUCKET;
        table.get(i).add(key);
    }

    public boolean search(int key) {
        int i = key % this.BUCKET;
        return table.get(i).contains(key);
    }

    public void remove(int key) {
        int i = key % this.BUCKET;
        table.get(i).remove((Integer) i);
    }
}
