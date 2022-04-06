package com.tang.leetCodeHot100;

public class p55跳跃游戏 {
    public boolean canJump(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > k) return false;
            k = Math.max(k, nums[i] + i);
        }
        return true;
    }
}
/*
怎么才能调到最后一格
直接一个一个跳
开始设置 能跳的最大距离为0 K=0
如果最大距离无法到达i 就是就失败

从第一个开始跳
记录能跳的最大距离
K=之前能跳的最大距离和当前位置能跳的最大距离的最大值 K=Math.max(k,i+nums[i])
 */