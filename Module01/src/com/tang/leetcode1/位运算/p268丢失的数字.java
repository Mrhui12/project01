package com.tang.leetcode1.位运算;

import java.util.Arrays;

@SuppressWarnings("all")
public class p268丢失的数字 {
    public int missingNumber(int[] nums) {
     int n =nums.length,ans=0;
        boolean[] visited = new boolean[n + 1];
        for (int num : nums) {
            visited[num]=true;
        }
        for (int i = 0; i <= n; i++) {
            if (visited[i]==false)
                ans=i;

        }
        return ans;
    }
}
