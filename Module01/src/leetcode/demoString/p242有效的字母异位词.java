package leetcode.demoString;

public class p242有效的字母异位词 {
    public boolean isAnagram(String s, String t) {
        int n = s.length(), m = t.length();
        if (n != m) return false;
        int[] arr = new int[26];
        for (int i = 0; i < n; i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        for (int num : arr
        ) {
            if (num != 0)
                return false;
        }
        return true;
    }
}
