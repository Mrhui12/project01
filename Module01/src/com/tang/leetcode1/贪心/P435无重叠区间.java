package com.tang.leetcode1.贪心;

import java.util.Arrays;
import java.util.Comparator;

public class P435无重叠区间 {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length < 2) return 0;
//        Arrays.sort(intervals,new Comparator<int[]>() {
//            public int compare(int[] arr1, int[] arr2) {
//                return arr1[1] - arr2[1];
        Arrays.sort(intervals, new Comparator<int[]>() {//这个函数很重要
            public int compare(int[] interval1, int[] interval2) {
                return interval1[1] - interval2[1];
            }
        });
        int n = intervals.length;
        int right = intervals[0][1];
        int ans = 0;
        for (int i = 1; i < n; i++) {
            if (intervals[i][0] < right) ans++;
            else right = intervals[i][1];
        }
        return ans;
    }
}
/*
        贪心算法
        去掉无用区间 最小数
        就得吧啊虽有区间从小到大 按照右边的值排列
        这样才能保持去掉的最小
        然后让right=第一个数组右区间
        去比较后面的左区间 如果大于他 局去掉
        并且结果加一
        反正更新right；
 */
