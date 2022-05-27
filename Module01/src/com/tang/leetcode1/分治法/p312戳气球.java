package com.tang.leetcode1.分治法;

@SuppressWarnings("all")
public class p312戳气球 {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n + 2];
        temp[0] = 1; //初始化边界值
        temp[n + 1] = 1;
        for (int i = 1; i <= n; i++) {
            temp[i] = nums[i - 1];
        }
        int[][] dp = new int[n + 2][n + 2];//初试化动态数组 闭区间
        for (int len = 3; len <= n + 2; len++) {//开区间长度
            for (int i = 0; i <= n + 2 - len; i++) {//区间左边界
                int res = 0;
                for (int index = i + 1; index < i + len - 1; index++) {//开区间中间取值  两边不能取
                    int left = dp[i][index];
                    int right = dp[index][i + len - 1];
                    res = Math.max(res, left + right + temp[index] * temp[i] * temp[i + len - 1]);//记录每个开区间的最大值
                }
                dp[i][i + len - 1] = res;//最后让这个开区间等于这个最大值
            }
        }
        return dp[0][n + 1]; //返回最大闭区间dp[0][n+1]
    }
}
/*
     K为最后打爆一个
     dp[i][j]=dp[i][k]+cal[i]*val[k]*val[j]+dp[k][j]
    区间问题得注意
 */