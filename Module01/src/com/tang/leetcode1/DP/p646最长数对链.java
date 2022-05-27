package com.tang.leetcode1.DP;

import java.util.Arrays;
import java.util.Comparator;

@SuppressWarnings("all")
public class p646最长数对链 {
    public int findLongestChain(int[][] pairs) {
        int n = pairs.length;
        if (n < 2) return n;
//        Arrays.sort(pairs,new Comparator<int[]>() {
//            public int compare(int[] arr1,int[] arr2){
//                return arr1[1]-arr2[1];
//            }
//        });
        Arrays.sort(pairs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int ans = 1;
        int pre = pairs[0][1];
        for (int[] pair : pairs) {
            if (pair[0] > pre) {
                ans++;
                pre = pair[1];
            }
        }
        return ans;
    }
}
/*
 贪心算法 先排序 再比较
 */