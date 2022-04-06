package com.tang.leetCodeHot100;

import java.util.Stack;

public class p32最长有效括号 {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') stack.push(i);
            else {
                stack.pop();
                if (stack.isEmpty())
                    stack.push(i);
                else {
                    max = Math.max(max, i - stack.peek());
                }
            }
        }
        return max;
    }

}
