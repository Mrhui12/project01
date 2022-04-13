package com.tang.leetCodeHot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class p47全排列2 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        boolean[] visited = new boolean[n];
        if (n == 0) return res;
        dfs(0, n, res, ans, visited, nums);
        return res;
    }

    private void dfs(int index, int length, List<List<Integer>> res, List<Integer> ans, boolean[] visited, int[] nums) {
        if (index == length) {
            res.add(new ArrayList<>(ans));
            return;
        }
        for (int i = 0; i < length; i++) {
            if (visited[i]) continue;
            if (i > 0 && nums[i] == nums[i - 1] && !visited[i-1]) continue;
            ans.add(nums[i]);
            visited[i] = true;
            dfs(index + 1, length, res, ans, visited, nums);
            ans.remove(ans.size() - 1);
            visited[i] = false;
        }
    }
}
/*
    怎么解决重复性问题？
    遇到相同的跳过
    还是在结果里面有的话就添加 这种可以 但是太慢了 为什么满 需要遍历 结果去判断 是否包括
 */