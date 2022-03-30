package com.tang.leetCodeHot100;

import java.util.LinkedList;
import java.util.Stack;

public class p20有效的括号 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[' || stack.isEmpty())
                stack.push(s.charAt(i));
            else if (stack.peek() == '{' && s.charAt(i) == '}' || stack.peek() == '(' && s.charAt(i) == ')' || stack.peek() == '[' && s.charAt(i) == ']')
                stack.pop();
            else return false;
        }
        return stack.isEmpty();
    }
}
/*
用栈来操作
 */