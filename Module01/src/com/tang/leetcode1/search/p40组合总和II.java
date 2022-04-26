package com.tang.leetcode1.search;

import java.util.*;

public class p40组合总和II {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        int len = candidates.length;
        boolean[] used = new boolean[len];
        if (candidates[0] > target || len == 0) return res;
        Deque<Integer> ans = new ArrayDeque<>();
        dfs(res, ans, 0, len, candidates, target,used);
        return res;
    }

    private void dfs(List<List<Integer>> res, Deque<Integer> ans, int index, int len, int[] candidates, int target, boolean[] used) {
        if (target == 0) {
            res.add(new ArrayList<>(ans));
            return;
        }
        for (int i = index; i < len; i++) {
            if (target < candidates[i])
                break;

            if (used[i])continue;
            if (i>0&&candidates[i]==candidates[i-1]&&!used[i-1])
                continue;
            used[i]=true;
            ans.addLast(candidates[i]);
            dfs(res, ans, i +1, len, candidates, target - candidates[i], used);
            used[i]=false;
            ans.removeLast();
        }
    }
}
/*
    和39题差不多
    先排序
    在DFS
    如果target==0 加入结果
    从 iNdex开始遍历
     当target<0 直接 braek；
     当用过当前的 continue;
     去掉重复项问题 当i>0 当前的值和上一个相等 并且上一个已经用完了
     continue;
     回溯
     target-nums[i] 且 index=i+1 因为元素不能重复用；
 */