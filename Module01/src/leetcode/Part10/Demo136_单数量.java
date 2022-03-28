package leetcode.Part10;

public class Demo136_单数量 {
    public int singleNumber(int[] nums) {
        int n = 0;
        for (int num : nums
        ) {
            n ^= num;


        }
        return n;
    }
}
