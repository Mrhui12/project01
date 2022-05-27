package com.tang.leetcode1.妙用数据结构;

import java.util.IllegalFormatCodePointException;
import java.util.Stack;

@SuppressWarnings("all")
public class MyQuque {
    private Stack<Integer> in;
    private Stack<Integer> out;

    public MyQuque() {
        this.in=new Stack<>();
        this.out=new Stack<>();
    }

    public void push(int x) {
        in.push(x);
    }

    public int pop() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        return out.pop();
    }

    public int peek() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        return out.peek();
    }

    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }
}
/*
        用两个栈顶替队列
         一个 in out
         当 压入的时候正常 压入 in
         出栈的时候  判断当前 out是否等于空 如果是的话 就把所有in的数组pop() push 到out
         最后返回out.pop();
         peek 也差不多
          判断空就是返回两个栈是否都为空
 */