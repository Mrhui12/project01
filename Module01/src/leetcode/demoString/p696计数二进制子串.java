package leetcode.demoString;

public class p696计数二进制子串 {
    public int countBinarySubstrings(String s) {
        int n = s.length();
        int pre = 0, cur = 1, ans = 0;//当前等于一
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {//只要相等就加
                cur++;
            } else {
                pre = cur;//不等就换
                cur = 1;
            }
            if (pre >= cur) {//前面的大于现在的就答案加以
                ++ans;
            }
        }
        return ans;
    }
}
