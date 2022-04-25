package com.tang.leetcode1.贪心;

import java.util.Arrays;
import java.util.Comparator;

public class p452 {
    public int findMinArrowShots(int[][] points) {
        int n = points.length;
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int pos = points[0][1], ans = 1;
        for (int[] point : points) {
            if (point[0] > pos) {
                ans++;
                pos = point[1];

            }
        }
        return ans;
    }
}
/*
    打气球
    根据气球横坐标的右边大小排序
    然后再遍历气球
    利用第一个的右坐标去比较后面的左坐标
    如果大于他就继续 如果小于他就更新右边 坐标 并且ans++;
 */