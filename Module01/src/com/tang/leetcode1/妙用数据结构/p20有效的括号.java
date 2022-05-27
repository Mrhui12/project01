package com.tang.leetcode1.妙用数据结构;

import java.util.Stack;

@SuppressWarnings("all")
public class p20有效的括号 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[' || s.charAt(i) == '(' || s.charAt(i) == '{'||stack.isEmpty())
                stack.push(s.charAt(i));
            else if (s.charAt(i) == ')' && stack.peek() == '(' || s.charAt(i) == '}' && stack.peek() == '{' || s.charAt(i) == ']' && stack.peek() == '[') {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
/*
        有效的括号 用一个堆栈实现
        遍历字符串 当当前字符串为{[(  或者当前栈为空的时候 入栈
        当当前为 }])且栈顶预制对应得到时候出栈
        不然返回 false
       遍历完 判断 当前字符串是否为空

 */