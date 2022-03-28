package leetcode.Structure.StacksList;

import java.util.Stack;

public class Demo20有效的括号 {
    public boolean isValid(String s) {

        Stack<Character> pared = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                pared.push(s.charAt(i));
            else {
                if (pared.isEmpty()) {
                    return false;
                }
                char c = pared.peek();
                if (c == '(' && s.charAt(i) == ')' ||
                        c == '[' && s.charAt(i) == ']' ||
                        c == '{' && s.charAt(i) == '}')
                    pared.pop();
                else {
                    return false;
                }
            }
        }
        return pared.isEmpty();
    }
}
