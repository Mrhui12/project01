package com.tang.leetcode1.妙用数据结构;

import java.util.Arrays;
import java.util.Stack;

@SuppressWarnings("all")
public class p503下一个更大元素II {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        Stack<Integer> sta = new Stack<>();
        for (int i = 0; i < 2 * n; i++) {
            int num = nums[i % n];
            while (!sta.isEmpty() && num > nums[sta.peek()]) {
                ans[sta.peek()] = num;
                sta.pop();
            }
            if (i < n) sta.push(i);
        }
        return ans;
    }

}
/*
        单调栈
        环形 就这届翻倍 遍历 再i%n

 */