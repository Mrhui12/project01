package leetcode.Structure.Hashtable;

import java.util.HashMap;

public class p149直线上最多的点数 {
    public int maxPoints(int[][] points) {
        int n = points.length;
        if (n <= 2)
            return n;
        int ans = 1;
        for (int i = 0; i < n; i++) {
            int max = 1;
            HashMap<String, Integer> map = new HashMap<>();
            for (int j = i + 1; j < n - 1; j++) {
                int a = points[i][0] - points[j][0], b = points[i][1] - points[j][1];
                int k = gcd(a, b);
                String key = (a / k) + "——" + (b / k);
                map.put(key, map.getOrDefault(key, 0) + 1);
                max = Math.max(max, map.get(key));
            }
            ans = Math.max(max, ans);
        }
        return ans;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
