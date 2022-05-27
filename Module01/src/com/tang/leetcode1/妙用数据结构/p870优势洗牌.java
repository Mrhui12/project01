package com.tang.leetcode1.妙用数据结构;

import java.util.Arrays;
import java.util.Comparator;

@SuppressWarnings("all")
public class p870优势洗牌 {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[][] resb = new int[n][2];
        Arrays.sort(nums1);
        for (int i = 0; i < n; i++) {
            resb[i] = new int[]{nums2[i], i};
        }
        Arrays.sort(resb, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int[] res = new int[n];
        int left = 0, right = n - 1;
        for (int i = 0; i < n; i++) {
            if (nums1[i] <= resb[left][0])
                res[resb[right--][1]] = nums1[i];
            else res[resb[left++][1]] = nums1[i];
        }
        return res;
    }
}
