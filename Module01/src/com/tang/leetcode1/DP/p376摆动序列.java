package com.tang.leetcode1.DP;
@SuppressWarnings("all")
public class p376摆动序列 {
    public int wiggleMaxLength(int[] nums) {
        int down=1,up=1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]>nums[i-1])
                up=down+1;
            else if (nums[i]<nums[i-1])
                down=up+1;
        }
        return nums.length==0?0:Math.max(down,up);
        }

}
/*
      注意到 down 和 up 只和前一个状态有关，所以我们可以优化存储，分别用一个变量即可。

 */