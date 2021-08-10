package com.griesner.stack;

public class MyStack {
    int[] arr;
    int cap;
    int top;

    public MyStack(int C) {
        this.top = -1;
        this.cap = C;
        this.arr = new int[this.cap];
    }

    public v oid

    push(int x) {
        this.top++;
        this.arr[top] = x;
    }

    public int pop() {
        int res = this.arr[this.top];
        this.top--;
        return res;
    }

    public int size() {
        return this.top + 1;
    }

    public boolean isEmpty() {
        return (this.top == -1);
    }
}
