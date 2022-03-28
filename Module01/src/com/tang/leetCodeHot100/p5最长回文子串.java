package com.tang.leetCodeHot100;

public class p5最长回文子串 {
    public String longestPalindrome(String s) {
        int n = s.length(), max = 0;//字符串长度
        int[] lr = new int[2];//一个数组 用来存放最长的左右指针
        for (int i = 0; i < 2 * n - 1; i++) {//遍历每一种初始可能 字符串长为N 它的就有2*n-1 个子字符串
            int l = i / 2, r = l + i % 2;//第个字符串的时候 最开始左指针为l=i/2;右指针为r=l+i%2;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {//当左右指针不越界 且对应字符相时候 l--,r++ 且更新最大值 和指针区间
                if (r - l + 1 > max) {
                    max = r - l + 1;
                    lr[0] = l;
                }
                r++;
                l--;
            }

        }
        String ans = "";
        ans = s.substring(lr[0], lr[0] + max);
        return ans;
    }
}
/*
647
 */