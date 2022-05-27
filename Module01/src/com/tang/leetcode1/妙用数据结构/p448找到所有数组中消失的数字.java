package com.tang.leetcode1.妙用数据结构;

import java.util.*;

@SuppressWarnings("all")
public class p448找到所有数组中消失的数字 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        boolean[] visited = new boolean[n + 1];
        for (int num : nums) {
            visited[num] = true;

        }
        for (int i = 1; i <= n; i++) {
            if (visited[i] == false) ans.add(i);
        }
        return ans;
    }
}
/*
        感觉重复了
 */