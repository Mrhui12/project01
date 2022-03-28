package leetcode.Structure.prictices;

import java.util.Arrays;
import java.util.Stack;

public class p503下一个更大元素II {
    public static int[] nextGreaterElements(int[] nums) {

        int n = nums.length;
        int[] newNums = new int[2 * n];

        for (int i = 0; i < 2 * n; i++) {
            newNums[i] = nums[i%n];
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = -1;
        }

        Stack<Integer> Stack = new Stack<>();
        for (int i = 0; i < 2 * n; i++) {
            while (!Stack.isEmpty() && newNums[Stack.peek()] < newNums[i]) {
                Stack.pop();
                ans[Stack.peek()%n] = newNums[i];
//                Stack.pop();
            }
            Stack.push(i);
        }


        return ans;
    }

    public static void main(String[] args) {
        int[] nums={1,2,1};
        System.out.println(Arrays.toString(nextGreaterElements(nums)));
    }

}
