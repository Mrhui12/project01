package com.tang.leetcode1.douleindex;

public class p76最小覆盖子串 {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) return "";
        int[] cnt = new int[58];
        int count = 0;
        for (int i = 0; i < t.length(); i++) {
            cnt[t.charAt(i) - 'A']--;
            count++;
        }
        int l = 0, len = Integer.MAX_VALUE,begin=0;
        for (int r = 0; r < s.length(); r++) {
            if (cnt[s.charAt(r) - 'A'] < 0) count--;
            cnt[s.charAt(r) - 'A']++;
            while (count == 0 && cnt[s.charAt(l)-'A'] > 0) {//注意这里啊啊啊啊
                cnt[s.charAt(l)-'A']--;
                l++;
            }
            if (count == 0 && len > r - l) {
                len = r - l;
                begin=l;
            }
        }
        return len >= s.length() ? "" : s.substring(begin, begin + len + 1);
    }
}
/*
    双指针 滑动窗口
    1.判断子串长度是否大于长串
    2.新建一个数组58 遍历子串让 cun-- count++;
    3.遍历长串 当cnt 右边指针 <0   count--; cnt++都会
    4.当count==0 且 cnt[s.charAt(l)-'A'>0
    l++; cnt[s.charAt(l)-'A'--;
    5.当 count==0 len>r-l 更新len
    6.遍历完 s串 判断 len是否大于等于s.length()?"":s.substring(l,l+len+1);
 */