package leetcode.Structure.StacksList;

import java.util.Arrays;
import java.util.Stack;

public class Demo739每日温度 {
    public static int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;
        int[] ans = new int[n];
        Stack<Integer> days = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!days.isEmpty()) {
                int pre_index = days.peek();
                if (temperatures[i] <= temperatures[pre_index]) {
                    break;
                }
                days.pop();
                ans[pre_index] = i - pre_index;
            }
            days.push(i);

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println(Arrays.toString(dailyTemperatures(nums)));

    }
}

