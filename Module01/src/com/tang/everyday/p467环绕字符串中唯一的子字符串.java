package com.tang.everyday;

@SuppressWarnings("ALL")
public class p467环绕字符串中唯一的子字符串 {
    public int findSubstringInWraproundString(String p) {
        int k = 0;
        int[] dp = new int[26];
        char[] cp = p.toCharArray();
        for (int i = 0; i < cp.length; i++) {
            if (i > 0 && (cp[i] - cp[i - 1] + 26) % 26 == 1)//
                k++;
            else {
                k = 1;
            }
            dp[cp[i] - 'a'] = Math.max(k, dp[cp[i] - 'a']);
        }
        int ans = 0;
        for (int i : dp) {
            ans += i;
        }
        return ans;
    }
}
/*
   dp[a]记录的为a结尾的子串个数
   最后所虽有字符结尾的dp加起来就是答案
   1.字符串换成字符串数组 速度加快
   2.结尾长度加 为 当前连续 且下班大于0
   不连续就直接为1 更新 以当前字符串结尾最大长度
 */