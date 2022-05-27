package com.tang.leetcode1.妙用数据结构;

import java.util.LinkedList;
import java.util.Queue;

@SuppressWarnings("all")
public class MyStack {
    private Queue<Integer> a;
    private Queue<Integer> b;

    public MyStack() {
        a = new LinkedList<>();
        b = new LinkedList<>();
    }

    public void push(int x) {
        a.offer(x);
        while (!b.isEmpty()) {
            a.offer(b.poll());
        }
        Queue<Integer> temp = b;
        b = a;
        a = temp;

    }

    public int pop() {
        return b.poll();
    }

    public int top() {
        return b.peek();
    }

    public boolean empty() {
       return b.isEmpty();
    }
}
