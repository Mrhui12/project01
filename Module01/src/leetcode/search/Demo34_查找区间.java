package leetcode.search;

public class Demo34_查找区间 {
    public int[] searchRange(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            if (nums[l] == target && nums[r] == target) {
                return new int[]{l, r};
            } else if (nums[l] < target) {
                l++;
            } else if (nums[r] > target) {
                r--;
            }
        }
        return new int[]{-1, -1};
    }
}