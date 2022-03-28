package leetcode.Part9;

public class Demo67_字符串加法 {
    public String addBinary(String a, String b) {
        String ans = "";
        int carry = 0;
        int num = 0;
        int n = a.length() - 1, m = b.length() - 1;
        while (n >= 0 || m >= 0) {
            num += n >= 0 ? a.charAt(n) - '0' : 0;
            num += m >= 0 ? b.charAt(m) - '0' : 0;
            num = num + carry;
            ans = num % 2 + ans;
            carry = num / 2;
            num = 0;
            m--;
            n--;
        }
        if (carry == 1) {
            ans = 1 + ans;
        }
        return ans;
    }

}
