package leetcode.Structure.arr;

import java.util.ArrayList;
import java.util.List;

public class Demo448_查找数组中所有消失的数字 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<Integer>();
        int[] arr = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[nums[i]]++;
        }
        for (int i = 1; i <= n; i++) {
            if (arr[i] == 0) ans.add(i);
        }
        return ans;
    }
}
