package leetcode.Structure.Listnode;

import java.util.Arrays;
import java.util.LinkedList;

public class p239滑动窗口最大值 {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] result = new int[n-k+1];
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            while (!queue.isEmpty()&&nums[queue.peekLast()]<nums[i]){
                queue.pollLast();
            }
            queue.addLast(i);
            if (queue.peek()<=i-k){
                queue.poll();
            }
            if (i+1>=k){
                result[i+1-k]=nums[queue.peek()];
            }
        }
        return  result;
    }

    public static void main(String[] args) {
        int[] nums = {1, -1};
        int k = 1;
        System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));
    }
}
