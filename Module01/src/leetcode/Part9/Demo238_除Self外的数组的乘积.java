package leetcode.Part9;

import java.util.Arrays;

public class Demo238_除Self外的数组的乘积 {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] R = new int[n];
        int[] L = new int[n];
        L[0] = 1;
        for (int i = 1; i < n; i++) {
            L[i] = nums[i - 1] * L[i - 1];
        }
        R[n - 1] = 1;
        for (int i = n - 2; i >= 0; i++) {
            R[i] = R[i + 1] * nums[i + 1];
        }
        for (int i = 0; i < n; i++) {
            ans[i] = R[i] * L[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
