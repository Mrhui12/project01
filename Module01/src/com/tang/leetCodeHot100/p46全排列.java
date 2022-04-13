package com.tang.leetCodeHot100;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class p46全排列 {
    @SuppressWarnings("all")
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        for (int num : nums) {
            ans.add(num);
        }
        int n = nums.length;
        dfs(0, ans, res, n);
        return res;

    }

    private static void dfs(int index, List<Integer> ans, List<List<Integer>> res, int length) {
        if (index == length - 1) {
            res.add(new ArrayList<>(ans));
            return;
        }
        for (int i = index; i < length; i++) {
            Collections.swap(ans, i, index);
            dfs(index + 1, ans, res, length);
            Collections.swap(ans, i, index);
        }
    }
}
/*
        全排列问题用 不含重复数组
        用DFS
        先把数组放在一个集合里面再去交换他们
        用循环 从 index 开始 到数组长结束
        当Index ==n-1 的时候吧集合添加到答案; 作为递归结束条件
        每次交换index 和i 位置的数
        =========================================
        当全排列 有重复数组的时候
        怎么办？ 先给数组 排队
        然后 相同就跳过吗
 */