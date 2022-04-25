package com.tang.leetcode1.douleindex;

public class p167两数之和输入有序数组 {
    public int[] towsum2(int[] numbers, int target) {
        int n = numbers.length;
        int l = 0, r = n - 1;
        while (l < r) {
            int num = numbers[l] + numbers[r];
            if (num < target) l++;
            else if (num > target) r--;
            else return new int[]{l + 1, r + 1};
        }
        return new int[]{-1, -1};
    }
}
/*
    双指针
    利用收尾指针
   计算他们之和
   在满足右边指针大于左边指针的条件下 循环
   当结果小了 r--
   当结果大了 l++;
   反正返回L R
 */