package leetcode.Structure.prictices;

import java.util.HashMap;
import java.util.Map;

public class p697数组的度 {
    public int findShortestSubArray(int[] nums) {
        int n = nums.length;
        HashMap<Integer, int[]> integerHashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (integerHashMap.containsKey(nums[i])) {
                integerHashMap.get(nums[i])[0]++;
                integerHashMap.get(nums[i])[2] = i;
            } else {
                integerHashMap.put(nums[i], new int[]{1, i, i});
            }
        }
        int max = 0, minlong = 0;
        for (Map.Entry<Integer, int[]> num : integerHashMap.entrySet()
        ) {
            int[] temp = num.getValue();
            if (temp[0] > max) {
                max = temp[0];
                minlong = temp[2] - temp[1] + 1;
            } else if (temp[0] == max) {
                minlong = Math.min(minlong, temp[2] - temp[1] + 1);
            }
        }

        return minlong;
    }
}
