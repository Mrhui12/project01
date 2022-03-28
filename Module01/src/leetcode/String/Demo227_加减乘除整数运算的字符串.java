package leetcode.String;

import java.util.Deque;
import java.util.LinkedList;

public class Demo227_加减乘除整数运算的字符串 {
    public static void main(String[] args) {
        String s="12+3*2+2";
        int ans=calculate(s);
        System.out.println(ans);
    }
    public static int calculate(String s) {

        Deque<Integer> stack = new LinkedList<Integer>();
        char preSign = '+';
        int num = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (Character.isDigit(s.charAt(i))) {
                num = num * 10 + s.charAt(i) - '0';
            }
            if (!Character.isDigit(s.charAt(i)) && s.charAt(i) != ' ' || i == n - 1) {
                switch (preSign) {
                    case '+':
                        stack.push(num);
                        break;
                    case '-':
                        stack.push(-num);
                        break;
                    case '*':
                        stack.push(stack.pop() * num);break;
                    case '/':
                        stack.push(stack.pop() / num);break;

                }
                preSign = s.charAt(i);
                num = 0;

            }
        }
        int ans = 0;
        while (!stack.isEmpty()) {
            ans += stack.pop();
        }

        return ans;
    }
}
