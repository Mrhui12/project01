package com.tang.leetCodeHot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p90子集2 {
    List<Integer> ans = new ArrayList<>();
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsetWithDUp(int[] nums) {
        Arrays.sort(nums);
        dfs(0, nums);
        return res;
    }

    private void dfs(int index, int[] nums) {
        res.add(new ArrayList<>(ans));
        for (int i = index; i < nums.length; i++) {
            if (i != index && nums[i] == nums[i - 1]) continue;
            ;
            ans.add(nums[i]);
            dfs(i + 1, nums);
            ans.remove(ans.size() - 1);
        }
    }
}


