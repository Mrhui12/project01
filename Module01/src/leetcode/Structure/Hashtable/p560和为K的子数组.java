package leetcode.Structure.Hashtable;

import java.util.HashMap;

public class p560和为K的子数组 {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length, count = 0, psum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int num :
                nums) {
            psum += num;
            if (map.containsKey(psum - k)) {
                count += map.get(psum - k);
            }
            map.put(psum, map.getOrDefault(psum, 0) + 1);
        }
        return count;
    }
}
