package leetcode.Structure.prictices;

import java.util.HashMap;

public class p217存在重复元素 {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        if (n < 2) return false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (map.get(nums[i]) == 2) return true;

        }
        return false;
    }
}
