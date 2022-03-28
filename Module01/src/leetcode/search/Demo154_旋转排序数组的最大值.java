package leetcode.search;

public class Demo154_旋转排序数组的最大值 {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,1,2,3};
        System.out.println(findMax(arr));
    }
    public static int findMax(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] > nums[l]) {
                l = mid;
            } else if (nums[mid] < nums[l]) {
                r = mid - 1;
            } else {
                l++;
            }
        }
        return nums[r];
    }

}
