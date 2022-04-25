package com.tang.everyday;

public class p806写字符串需要的行数 {
    public int[] numberOfLines(int[] widths, String s) {
        int n = s.length();
        int[] ans = new int[2];
       int a=0,b=0;
        if (n == 0) return ans;
        for (int i = 0; i < n; i++) {
            int t=widths[s.charAt(i) - 'a'];
            if (b+t>100&&++a>0)b=t;
            else b+=t;
        }
        ans[0] = a;
        ans[1] = b;
        return ans;
    }
}
