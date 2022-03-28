package leetcode.String;

public class Demo242_判断两个字符串包含的字符是否完全相同 {
    public static void main(String[] args) {
        String S="aacdefg";
        String t="gacdefb";
        System.out.println(isAngram(S,t));
    }
    public static boolean isAngram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;

        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                return false;
            }

        }
        return true;
    }

}
