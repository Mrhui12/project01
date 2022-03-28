package leetcode.Structure.Hashtable;

class NumArray {
    int[] sums;

    public NumArray(int[] nums) {
        int n = nums.length;
        sums = new int[n+1];
        for (int i = 0; i < n; i++) {
            sums[i+1] = nums[i]+sums[i];
        }
    }

    public int sumRange(int left, int right) {
        return sums[right+1] - sums[left];
    }
}
