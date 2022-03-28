package leetcode.Part9;

public class Demo504 {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        boolean is_negative = num < 0;
        if (is_negative) {
            num = -num;
        }
        String ans=" ";
        while (num != 0) {
            int a = num / 7, b = num % 7;
            num = a;
            ans = b +ans;

        }
        return is_negative ? "-" + ans : ans;
    }
}
