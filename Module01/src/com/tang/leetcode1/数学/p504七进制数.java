package com.tang.leetcode1.数学;

@SuppressWarnings("all")
public class p504七进制数 {
    public String convertToBase7(int num) {
       if (num==0)return "0";
       boolean Flag=num<0;
       num=Math.abs(num);
        StringBuilder ans = new StringBuilder();
        while (num!=0){
            ans.append(num%7);
            num=num/7;
        }
        return Flag?"-"+ans.reverse().toString():ans.reverse().toString();
    }
}
