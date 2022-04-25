package com.tang.leetCodeHot100;

import java.util.Arrays;

public class p128最长连续序列 {
    public int longestConsecutive(int[] nums){
        int max=1,n=nums.length;
        if (n==0)return 0;
        int ans=1;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (nums[i+1]==nums[i]+1)
            {
                ans+=1;
                max= Math.max(max,ans);
            }else if (nums[i+1]==nums[i])continue;
            else ans=1;
        }
        return max;
    }
}
/*
    先排序 并且注意便利的范围
    当下一个比当前大一的时候 ans++;更新最大值
    当以一个和当前相等时 继续下一步
    当都不满足时 跟新 ANS=1;
 */