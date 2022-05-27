package com.tang.leetcode1.妙用数据结构;

import java.util.LinkedList;

@SuppressWarnings("ALL")
public class p239滑动窗口最大值 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length < 2) return nums;
        int[] ans = new int[nums.length - k + 1];
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            while (!list.isEmpty() && nums[list.peekLast()] < nums[i]) {
                list.pollLast();
            }
            list.addLast(i);
            if (list.peek() < i - k + 1) list.pollFirst();
            if (i + 1 >= k) {
                ans[i + 1 - k] = nums[list.peek()];
            }
        }
        return ans;
    }
}
/*
 思路 双端队列
  当数组长度 小于2的时候 直接返回数组
  然后新建立一个结果 长度为 n-k+1
  建立一个队列
  遍历
 当队列不为0 且 队列尾部小于当前的 值直接循环推出 尾部 知道曼满足
 将当前的i加入尾部
 如果前面的 超出了 就 推出线面的  最前面的 <i-k+1
 推出
 当 i-k+1>=0
 ans[i-k+1]=nums[peek()];
 */