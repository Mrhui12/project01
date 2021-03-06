package leetcode.Structure.arr;

public class Demo769_分类的最大块 {
    public int maxChunksToSorted(int[] arr) {
        int max = 0, n = arr.length, ans = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
            if (max == i)
                ans++;
        }
        return ans;
    }
}
