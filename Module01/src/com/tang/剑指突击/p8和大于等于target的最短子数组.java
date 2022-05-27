package com.tang.剑指突击;

@SuppressWarnings("all")
public class p8和大于等于target的最短子数组 {
    public int minSubArrayLen(int target, int[] nums) {
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0, j = 0; i < nums.length; i++) {
            sum += nums[i];
            while (j <= i && sum >= target) {
                ans = Math.min(ans, i - j + 1);
                sum -= nums[j++];

            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
