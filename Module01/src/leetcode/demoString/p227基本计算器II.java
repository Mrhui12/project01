package leetcode.demoString;

import java.util.Deque;
import java.util.LinkedList;

public class p227基本计算器II {
    public int calculate(String s) {
        int n = s.length(), num = 0;
        char presign = '+';
        Deque<Integer> clc = new LinkedList<Integer>();
        for (int i = 0; i < n; i++) {
            if (Character.isDigit(s.charAt(i))) {
                num = num * 10 + s.charAt(i)-'0';
            }
            if (!Character.isDigit(s.charAt(i)) && s.charAt(i) != ' ' || i == n - 1) {//条件 判断是否为数字 是否为空格 是否为最后一个
                switch (presign) {
                    case '+':
                        clc.push(num);
                        break;
                    case '-':
                        clc.push(-num);
                        break;
                    case '*':
                        clc.push(clc.pop() * num);
                        break;
                    default:
                        clc.push(clc.pop() / num);


                }
                presign = s.charAt(i);
                num = 0;


            }
        }
        int ans = 0;
        while (!clc.isEmpty()) {
            ans += clc.pop();
        }
        return ans;
    }
}
