package com.tang.leetcode1.妙用数据结构;

import java.util.Arrays;

@SuppressWarnings("all")
public class p594最长和谐子序列 {
    public int findLHS(int[] nums) {

        Arrays.sort(nums);
        int begin = 0, res = 0;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] - nums[begin] > 1) begin++;
            if (nums[i] - nums[begin] == 1)
                res = Math.max(res, i - begin + 1);
        }
        return res;
    }
}
/*
   先排序
   在给一个初试下标
   遍历 数组
   当当前值减去初试下标准的结果大于一
   begin++
   当等于一的时候 更新 最大值 ；
 */