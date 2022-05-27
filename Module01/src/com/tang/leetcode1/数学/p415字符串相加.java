package com.tang.leetcode1.数学;

@SuppressWarnings("all")
public class p415字符串相加 {
    public String addStrings(String num1, String num2) {
        int n = num1.length(), m = num2.length();
        if (n == 0 || m == 0) return m == 0 ? num1 : num2;
        StringBuilder ans = new StringBuilder();
        int carry = 0;
        while (n > 0 || m > 0) {
            int a = n > 0 ? num1.charAt(--n) - '0' : 0;
            int b = m > 0 ? num2.charAt(--m) - '0' : 0;
            int sum = a + b + carry;
            ans.append(sum % 10);
            carry = sum / 10;
        }
        if (carry == 1) ans.append(1);
        return ans.reverse().toString();
    }
}
/*
        先记录两个字符串长度
        当其中有在字符串为0 是
        返回另一个字符串
        建立一个StringBuilder 拼接字符串
        初始化一个进位 carry
        遍历两个字符串 while(n>0||m>0)
         取两个的值  当地址大于0的时候 不然让他为0
          int a = n > 0 ? num1.charAt(--n) - '0' : 0;
            int b = m > 0 ? num2.charAt(--m) - '0' : 0;
            之后求和 且加进位
             加入对10的取余
             并且更新carry
             最后如果 carry==1
             还要再加一个1
             返回 ans.reverse().toString();
 */