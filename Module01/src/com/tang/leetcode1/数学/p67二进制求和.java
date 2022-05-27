package com.tang.leetcode1.数学;

@SuppressWarnings("all")
public class p67二进制求和 {
    public String addBinary(String a, String b) {
        int m = a.length(), n = b.length();
        if (m == 0 || n == 0) return m == 0 ? b : a;
        int carry = 0;
        StringBuilder ans = new StringBuilder();
        while (n > 0 || m > 0) {
            int c = m > 0 ? a.charAt(--m) - '0' : 0;
            int d = n > 0 ? b.charAt(--n) - '0' : 0;
            int num = c + d + carry;
            ans.append(num % 2);
            carry = num / 2;
        }
        if (carry == 1) ans.append(1);
        return ans.reverse().toString();
    }
}
