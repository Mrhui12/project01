package 笔试.华为;

@SuppressWarnings("all")
public class p1小孩子分糖果游戏 {
    public int[] candy(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] > nums[j])
                    ans[i] += 1;
            }
        }
        return ans;
    }

}
