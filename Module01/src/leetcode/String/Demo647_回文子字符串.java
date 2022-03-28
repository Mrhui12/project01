package leetcode.String;

public class Demo647_回文子字符串 {
    public static void main(String[] args) {
        String s="abc";
        System.out.println(countSubstring(s));
    }
    public static int countSubstring(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count += extendSubstrings(s, i, i);
            count += extendSubstrings(s, i, i + 1);

        }
        return count;
    }

    public static int extendSubstrings(String s, int l, int r) {
        int count = 0;
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            count++;
            l--;
            r++;
        }
        return count;
    }
}
