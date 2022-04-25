package com.tang.leetcode1.search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class p46全排列 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        for (int num : nums) {
            ans.add(num);
        }
        int n = nums.length;
        dfs(res, ans, 0, n);
        return res;
    }

    private void dfs(List<List<Integer>> res, List<Integer> ans, int index, int n) {
        if (index == n - 1) {
            res.add(new ArrayList<>(ans));
            return;
        }
        for (int i = index; i < n; i++) {
            Collections.swap(ans, i, index);
            dfs(res, ans, index + 1, n);
            Collections.swap(ans, i, index);

        }
    }
}
