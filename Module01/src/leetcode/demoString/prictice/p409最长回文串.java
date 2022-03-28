package leetcode.demoString.prictice;

import java.util.HashMap;
import java.util.Map;

public class p409最长回文串 {
    public int longestPalindrome(String s) {
        int max = 0, ans = 0, n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (Map.Entry<Character, Integer> map1 :
                map.entrySet()) {
            int temp = map1.getValue();
            ans = temp / 2 * 2;//先除再乘
            if (temp % 2 == 1 && ans % 2 == 0) ans++;//加一次就好了
        }

        return ans;
    }
}
