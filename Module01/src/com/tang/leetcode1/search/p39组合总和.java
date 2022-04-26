package com.tang.leetcode1.search;

import java.util.*;

public class p39组合总和 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        if (candidates.length==0||candidates[0]>target)return res;
        Deque<Integer> ans = new ArrayDeque<>();
        int len=candidates.length;
        dfs(candidates,target,len,0,res,ans);
        return  res;
    }

    private void dfs(int[] candidates, int target, int len, int index, List<List<Integer>> res, Deque<Integer> ans) {
        if (target==0){//当target==0 加入结果
            res.add(new ArrayList<>(ans));
            return;
        }
        for (int i = index; i < len; i++) {//每次从index开始
            if (target-candidates[i]<0)break;//剪枝 当剩下的大于target 没必要继续便利了
            ans.addLast(candidates[i]);
            dfs(candidates,target-candidates[i],len,i,res,ans);//target-zhi cong i开始
            ans.removeLast();
        }

    }
}
/*
        DFS
        先排序
         dfs(candidates,target,len,0,res,ans);
         当target==0 返回结果 return
         遍历 从index开始
         当target<nums[i]直接break 没必要继续了因为排好序的
         回溯
         target-nums[i]  index=i;
 */