package com.tang.leetcode1.douleindex;

@SuppressWarnings("all")
public class p88合并两个有序数组 {
    public void merger(int[] nums1, int m, int[] nums2, int n) {
        int i = m-- + --n;
        while (n >= 0) {
            nums1[i--] = m >= 0 && nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
        }
    }
}
/*
    双指针问题
    先让总的指针等于m--+--n;
    判断n是否》=0;
    之后判断大小并且m是否的》=0;
    如果是就i--= s2 n--
    反正i--= s1m--;
    这个和合并两个链表有点像
    但是链表用的递归
 */