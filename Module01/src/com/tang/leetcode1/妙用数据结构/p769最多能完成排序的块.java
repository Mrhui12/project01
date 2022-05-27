package com.tang.leetcode1.妙用数据结构;

@SuppressWarnings("all")
public class p769最多能完成排序的块 {
    public int maxChunksToSorted(int[] arr) {
        int max = 0, ans = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            if (max == i) ans++;
        }
        return ans;
    }
}
/*
        从左到右遍历数组
        当最大值等于当前的下表的时候
        结果加一

 */