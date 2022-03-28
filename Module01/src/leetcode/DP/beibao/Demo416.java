package leetcode.DP.beibao;

public class Demo416 {
    public boolean canPartition(int[] nums) {
        int n = nums.length, max_value = 0, sum = 0;
        if (n < 2) {
            return false;
        }
        for (int num : nums
        ) {
            sum += num;
            max_value = Math.max(max_value, num);

        }

        if (sum % 2 != 0) {
            return false;
        }
        int garget = sum / 2;
        if (max_value > garget) {
            return false;
        }

        boolean[] dp = new boolean[garget + 1];
        dp[0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = garget; j > nums[i - 1]; j--) {
                dp[j] |= dp[j - nums[i - 1]];
            }

        }
        return dp[garget];
    }
}
