package leetcode.demoString.prictice;

import java.util.HashMap;

public class p5最长回文子串 {
    public String longestPalindrome(String s) {
        int n = s.length(), max = 0;

       ;
        int[] lr = new int[2];
        for (int i = 0; i < 2 * n - 1; i++) {
            int l = i / 2;
            int r = l + i % 2;
            while (r < n && l >= 0 && s.charAt(l) == s.charAt(r)) {

//                max = Math.max(max, r - l + 1);
//                map.put(max, new int[]{l, r});
                if (r - l + 1 > max) {
                    max = r - l + 1;
                    lr[0] = l;
                }
                l--;
                r++;
            }
        }
        String ans = "";
        ans = s.substring(lr[0], lr[0] + max);
        return ans;
    }
}
