package leetcode.Part10;

public class Demo693_交替位的二进制数 {
    public boolean hasAlternatingBits(int n) {
        String ans = "";

        while (n > 0) {
            ans += n % 2;
            n >>= 1;
        }
        int length = ans.length();
        for (int i = 1; i < length; i++) {
            if (ans.charAt(i) == ans.charAt(i - 1)) return false;
        }
        return true;

    }
}
