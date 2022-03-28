package leetcode.search;

public class Demo540_在一个排序的中的单个元素 {
    public int singleNonDuplicate(int[] nums) {
        int lo = 0;
        int high = nums.length - 1;
        while (lo < high) {
            int mid = (lo + high) / 2;
            if (mid % 2 == 1) {mid--;}
            if (nums[mid] == nums[mid + 1]) {
                lo = mid + 2;
            } else {
                high = mid;
            }
        }
        return nums[lo];
    }
}
