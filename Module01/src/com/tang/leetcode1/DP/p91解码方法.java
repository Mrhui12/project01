package com.tang.leetcode1.DP;

@SuppressWarnings("all")
public class p91解码方法 {
    public int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (s.charAt(i-1) != '0')
                dp[i] = dp[i - 1];
            if (i > 1 && s.charAt(i - 2) != '0' && ((s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0'))<=26)
                dp[i]+=dp[i-2];
        }
        return dp[n];
    }
}
/*
一条包含字母 A-Z 的消息通过以下映射进行了 编码 ：
        思路
        创建dp[n+1]
        dp[0]==1;
        遍历字符串
        字符串取值得减去1；
        如果当前在字符！=0 他就可以+=dp[i-1]
        如果当前i>1 且瞒住在10~26之间
        +=dp[i-2];
        返回dp[n];
 */