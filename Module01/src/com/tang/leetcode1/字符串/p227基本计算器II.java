package com.tang.leetcode1.字符串;

import java.util.Deque;
import java.util.LinkedList;

@SuppressWarnings("all")
public class p227基本计算器II {
    public int calculate(String s) {
        int ans = 0, n = s.length(), num = 0;
        char sign = '+';
        Deque<Integer> clc = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (Character.isDigit(s.charAt(i))) {
                num += num * 10 + s.charAt(i) - '0';
            }
            if (!Character.isDigit(s.charAt(i)) && s.charAt(i) != ' ' || i == n - 1) {
                switch (sign) {
                    case '+':
                        clc.push(num);
                        break;
                    case '-':
                        clc.push(-num);
                        break;
                    case '*':
                        clc.push(clc.pop() * num);
                        break;
                    case '/':
                        clc.push(clc.pop() / num);
                        break;
                }
                sign = s.charAt(i);
                num = 0;

            }
        }
        while (!clc.isEmpty()) {
            ans += clc.pop();
        }
        return ans;
    }
}
