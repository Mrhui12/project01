package com.tang.leetcode1.search;

import java.util.*;

public class p47全排列II {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length == 0) return res;
        Arrays.sort(nums);
        int n = nums.length;
        boolean[] visited = new boolean[n];
        Deque<Integer> ans = new ArrayDeque<>();
        dfs(0, ans, res, visited, n, nums);
        return res;
    }

    private void dfs(int index, Deque<Integer> ans, List<List<Integer>> res, boolean[] visited, int n, int[] nums) {
        if (ans.size() == n) {
            res.add(new ArrayList<>(ans));
            return;
        }
        for (int i = 0; i < n; i++) {//?0还是index
            if (visited[i])continue;
            if (i > 0 && nums[i] == nums[i - 1]&&!visited[i-1]) continue;
            visited[i]=true;
            ans.addLast(nums[i]);
            dfs(index + 1, ans, res, visited, n, nums);
            visited[i]=false;
            ans.removeLast();
        }
    }
}
/*
    先给数组排序
    之后DFS
    如果长度为结果长度
    加入加入家国
  如果用过直接跳过
  如果没有用过 但是和上一个相等 且上一个已经用完了 直接跳过
  回溯
 */