package com.tang.leetcode1.妙用数据结构;

import java.util.Stack;

@SuppressWarnings("all")
public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> min;

    public MinStack() {
        this.stack = new Stack<>();
        this.min = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (min.isEmpty() || min.peek() >= val)
            min.push(val);

    }

    public void pop() {
        if (!min.isEmpty() && min.peek() == stack.peek())
            min.pop();
        stack.pop();

    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
/*
   最小问题
   引入 额外的一个最小栈
   当入栈的时候  如果最小栈的peek >=val或者 最小栈为空 压入
   出栈的时候也要注意 当 出栈的值等于 最小值peek  min也需要出栈


 */