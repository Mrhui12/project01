package leetcode.Part9;

import java.util.Random;

public class Demo384_移动数组 {
    class Solution {
        int[] nums;
        int n;
        Random random = new Random();

        public Solution(int[] _nums) {
            this.nums = _nums;
            this.n = _nums.length;
        }

        public int[] reset() {
            return nums;
        }

        public int[] shuffle() {
            int[] ans = nums.clone();
            for (int i = 0; i < n; i++) {
                swap(ans, i, i + random.nextInt(n - i));
            }
            return  ans;
        }

        private void swap(int[] ans, int i, int i1) {
            int temp;
            temp = ans[i];
            ans[i] = ans[i1];
            ans[i1] = temp;
        }
    }
}