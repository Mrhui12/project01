package com.tang.leetCodeHot100;

import java.util.ArrayList;

public class p4寻找两个正序数组的中位数 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        int right = (n + m + 1) / 2, left = (n + 2 + m) / 2;
        return (medianSortedArrays(nums1, 0, n-1, nums2, 0, m-1, right) + medianSortedArrays(nums1, 0, n-1, nums2, 0, m-1, left)) / 2;
    }

    private double medianSortedArrays(int[] nums1, int i, int n, int[] nums2, int i1, int m, int right) {
        int len1 = n - i+1, len2 = m - i1+1;//长度一直在更新
        if (len1 > len2) return medianSortedArrays(nums2, i1, m, nums1, i, n, right);//交换 将短的换到前面来
        if (len1 == 0) return nums2[i1 + right - 1];//短的为0时候 就返回长的 i1+right-1位
        if (right == 1) return Math.min(nums1[i], nums2[i1]);//为一时 就返回剩下的第一位 小的
        int j = i + Math.min(len1, right / 2) - 1;//计算各自的第K位，当第K位大于长度时，就用最后一位
        int k = i1 + Math.min(len2, right / 2) - 1;
        if (nums1[j] > nums2[k]) return medianSortedArrays(nums1, i, n, nums2, k + 1, m, right - (k - i1 + 1));//截取前面的 并且更新K的值
        else return medianSortedArrays(nums1, j + 1, n, nums2, i1, m, right - (j - i + 1));
    }
}