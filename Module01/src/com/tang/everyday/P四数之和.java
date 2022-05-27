package com.tang.everyday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("ALL")
public class P四数之和 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        if (nums.length < 4) return res;
        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            if ((long) nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target)
              break;
            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j-1]) continue;
                if ((long) nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target)
                   break;
                if ((long) nums[i] + nums[j] + nums[n - 1] + nums[n - 2] < target)
                    continue;
                int l = j + 1, r = n - 1;
                int num = nums[i] + nums[j] + nums[l] + nums[r];
                while (l < r) {
                    if (num < target) l++;
                    else if (num > target) r--;
                    else {
                        res.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                        while (r > l && nums[r - 1] == nums[r]) r--;
                        r--;
                        while (r > l && nums[l + 1] == nums[l]) l++;
                        l++;
                    }
                }

            }
        }
        return  res;
    }
}