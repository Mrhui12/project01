package leetcode.search;

public class Demo69_求开方 {
    public int mySqrt(int x) {
        int l = 0;
        int r = x;
        int ans1 = 0;
        while (l <= r) {
            int num = l + (r - l) / 2;
            long ans = (long)num * num;
            if (ans == x) {
                ans1 = num;
                return num;

            } else if (ans < x) {
                l = num + 1;
                ans1=num;
            } else {
                r = num - 1;
            }
        }
        return ans1;
    }
}
