package com.tang.leetcode1.DP;
@SuppressWarnings("all")
public class p494目标和 {
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for (int num : nums) {
            sum+=num;
        }
        if (Math.abs(target)>Math.abs(sum))return 0;
        int n=nums.length;
        int range=sum*2+1;
        int[][] dp = new int[n][range];
        dp[0][sum-nums[0]]+=1;
        dp[0][sum+nums[0]]+=1;
        for (int i = 1; i < n; i++) {
            for (int j=-sum;j<=sum;j++){
                if (j+nums[i]>sum){
                       dp[i][j+sum]=dp[i-1][j-nums[i]+sum]  +0;
                }else if (j-nums[i]<-sum){
                    dp[i][j+sum]=dp[i-1][j+sum+nums[i]];
                }
                else  dp[i][j+sum]=dp[i-1][j-nums[i]+sum]+dp[i-1][j+nums[i]+sum];
            }
        }
            return dp[n-1][target+sum];
    }
}
/*
    目标和
    先初始化 如果sum的绝对值小于target返回0
    让区域等于 range=2*sum+1 ;
    n=nums.length()
    建一个dp[n][range]
    初始化第一个
    dp[0][sum-num[0]+=1;
    d[0][sum+nums[0]+=1;
    0-1 背包
    for 1:n
    for j=-sum:sum
    满足边界条件  dp[i][j+sum]=dp[i-1][j+sum-nums[i]+dp[i-1][j+sum+nums[i]
    反之只写一边
 */