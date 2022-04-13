package com.tang.leetCodeHot100;

import java.util.ArrayList;
import java.util.List;

public class p78子集 {
    List<Integer> ans = new ArrayList<>();
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        if (nums.length == 0) {
            res.add(ans);
            return res;
        }
        dfs(0, nums);
        return res;

    }

    private void dfs(int index, int[] nums) {
        res.add(new ArrayList<>(ans));
        for (int i = index; i < nums.length; i++) {
            if (ans.contains(nums[i])) continue;
            else ans.add(nums[i]);
            dfs(i + 1, nums);
            ans.remove(ans.size() - 1);
        }
    }
}
/*
回溯法的思想
但是在递归的过程中没有终止条件 第一次见到
循环递归  i=index 开始
 */