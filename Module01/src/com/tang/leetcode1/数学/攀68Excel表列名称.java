package com.tang.leetcode1.数学;

@SuppressWarnings("all")
public class 攀68Excel表列名称 {
    public String convertToTitle(int columnNumber) {
        StringBuilder ans = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            ans.append((char) (columnNumber % 26 + 'A'));
            columnNumber /= 26;
        }
        return ans.reverse().toString();
    }
}
/*
        字符串拼接尽量用BUlielder
        当 n>0
        n--
        ans.append((char)(n%26+'A'))
        ans.reverse().toString();
 */