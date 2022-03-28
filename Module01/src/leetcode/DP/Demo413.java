package leetcode.DP;

public class Demo413 {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        if (nums == null || n <= 2) {
            return 0;
        }
        int ans = 0, d = 0;
        int[] dp = new int[nums.length];
        for (int i = 2; i < n; i++) {
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                d++;

            } else {
                d = 0;
            }
            ans += d;

        }
        return ans;

    }
}
