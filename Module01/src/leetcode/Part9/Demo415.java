package leetcode.Part9;

public class Demo415 {
    public static String addStrings(String num1, String num2) {
        int n = num1.length() - 1, m = num2.length() - 1, carry = 0;
        StringBuffer stringBuffer = new StringBuffer("");
        while (n >= 0 || m >= 0) {
            int n1 = n >= 0 ? num1.charAt(n) - '0' : 0;
            int n2 = m >= 0 ? num2.charAt(m) - '0' : 0;
            int tmp = n1 + n2 + carry;
            stringBuffer.append(tmp % 10);
            carry = tmp / 10;
            n--;
            m--;
        }
        if (carry == 1) {
            stringBuffer.append(1);
        }
       return  stringBuffer.reverse().toString();

    }

    public static void main(String[] args) {
        String str1="139";
        String str2="26";
        System.out.println(addStrings(str1,str2));
    }
}
