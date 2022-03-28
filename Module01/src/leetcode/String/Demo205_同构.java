package leetcode.String;

public class Demo205_同构 {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] sarr = new int[26];
        int[] tarr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            if (sarr[s.charAt(i) - 'a'] != tarr[t.charAt(i) - 'a']) {
                return false;
            }
            sarr[s.charAt(i) - 'a'] = tarr[t.charAt(i) - 'a'] = i + 1;
        }
        return true;
    }
}
