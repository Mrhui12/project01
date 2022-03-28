package com.tang.offer.P剑指Offer04.剑指Offer07;

import java.util.Deque;
import java.util.LinkedList;

public class 队列的最大值 {
    Deque<Integer> res;
    Deque<Integer> max;

    public 队列的最大值() {
        res = new LinkedList<>();
        max = new LinkedList<>();
    }

    public int max_value() {
        if (max.isEmpty()) return -1;
        return max.peekFirst();
    }

    public void push_back(int value) {
        if (!max.isEmpty() && max.peekLast() < value) max.removeLast();
        max.addLast(value);
        res.addLast(value);
    }

    public int pop_front() {
        if (res.isEmpty()) return -1;
        if (res.peekFirst() == max.peekFirst())
            max.removeFirst();
        return res.pollFirst();
    }
}
