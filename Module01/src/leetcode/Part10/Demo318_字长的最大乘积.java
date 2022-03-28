package leetcode.Part10;

import java.util.HashMap;
import java.util.Map;

public class Demo318_字长的最大乘积 {
    public int maxProduct(String[] words) {
        int n = words.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (String word :
                words) {
            int m = word.length();
            int t = 0;
            for (int i = 0; i < m; i++) {
                int u = word.charAt(i) - '0';
                t |= (1 << u);
            }
            if (!map.containsKey(t) || map.get(t) < m) map.put(t, m);
        }
        int ans = 0;
        for (int a : map.keySet()
        ) {
            for (int b : map.keySet()
            ) {
                if ((a & b) == 0) ans = Math.max(ans, map.get(a) * map.get(b));

            }

        }
        return ans;
    }
}
