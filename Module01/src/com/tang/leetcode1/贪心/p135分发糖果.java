package com.tang.leetcode1.贪心;

public class p135分发糖果 {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] left = new int[n];
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1])
                left[i] = left[i - 1] + 1;
            else left[i] = 1;
        }
        int ret =left[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1])
                left[i] = Math.max(left[i + 1] + 1, left[i]);
            ret += left[i];
        }
        return ret;
    }
}
/*
    思路左右遍历
    贪心思想
    左右来回遍历
    处理好边界条件
    用一个额外的数组记录饼干值
    最后把他们加起来；
    第二次遍历的时候 需要考虑当前 和上面加一情况的最大值

 */