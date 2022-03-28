package leetcode.Structure.Hashtable;

import java.util.Arrays;
import java.util.Map;

public class p128最长连续序列 {
    public static int longestConsecutive(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length, ans = 1, max = 1;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i + 1] == nums[i]+1) {
                ans += 1;
                max = Math.max(ans, max);
            } else ans = 0;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums={100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }
}
