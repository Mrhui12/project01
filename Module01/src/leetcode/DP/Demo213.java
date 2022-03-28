package leetcode.DP;

import java.util.Arrays;

public class Demo213 {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return nums[0];
        }
        return Math.max(maxrob(Arrays.copyOfRange(nums, 0, nums.length - 1)),
                maxrob(Arrays.copyOfRange(nums, 1, nums.length)));
    }

    private int maxrob(int[] copyOfRange) {
        int cur = 0, pre = 0, temp = 0;
        for (int num : copyOfRange
        ) {
            temp = cur;
            cur = Math.max(cur, pre + num);
            pre = temp;

        }
        return cur;
    }
}
