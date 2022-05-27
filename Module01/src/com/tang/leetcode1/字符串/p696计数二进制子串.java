package com.tang.leetcode1.字符串;

@SuppressWarnings("all")
/*
若不同数字的连续长度大于等于
当前数字的连续长度，则说明存在一个且只存在一个以当前数字结尾的满足条件的子字符串。

 */
public class p696计数二进制子串 {
    public int countBinarySubstrings(String s) {
        int pre = 0, cur = 1, n = s.length(), ans = 0;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i - 1))
                cur++;
            else {
                pre = cur;
                cur = 1;
            }
            if (pre >= cur) ans++;
        }
        return ans;
    }
}
