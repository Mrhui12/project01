package leetcode.Structure.Hashtable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Demo1_twoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = {-1, -1};

        Map<Integer, Integer> hashtable = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            if (!hashtable.containsKey(target - nums[i]) || hashtable.isEmpty())
                hashtable.put(nums[i], i);
            else {
                result[0] = hashtable.get(target - nums[i]);
                result[1] = i;
                return result;

            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
}
