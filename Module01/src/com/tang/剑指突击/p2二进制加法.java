package com.tang.剑指突击;

@SuppressWarnings("all")
public class p2二进制加法 {
    public String addBinary(String a, String b) {
        int n = a.length(), m = b.length();
        if (n * m == 0) return n == 0 ? b : a;
        StringBuilder ans = new StringBuilder();
        int carry = 0;
        while (n > 0 || m > 0) {
            int numa = n > 0 ? a.charAt(--n) - '0' : 0;
            int numb = m > 0 ? b.charAt(--m) - '0' : 0;
            int num = numa + numb + carry;
            ans.append(num % 2);
            carry = num / 2;
        }
        if (carry == 1) ans.append(1);
        ans = ans.reverse();
        return ans.toString();
    }
}
