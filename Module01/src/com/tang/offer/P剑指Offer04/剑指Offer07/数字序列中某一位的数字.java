package com.tang.offer.P剑指Offer04.剑指Offer07;

public class 数字序列中某一位的数字 {
    public int findNthDigit(int n) {//第多少位
        int digte = 1;
        long start = 1, count = 9;//注意基本数据类型 后面数字打了 long型
        while (n - count > 0) {
            digte += 1;//位数
            start *= 10;//第几位的起始数
            n -= count;//更新下n
            count = start * digte * 9;//第几位有多少位置
        }
        long num = start + (n - 1) / digte;//结果
        int m = (n - 1) % digte;
        return Long.toString(num).charAt(m) - '0';
    }
}
/*
1.n-count>0
digte+=1;
n-=count
start*=q0;
count=digte*start*9;  1~9 9 10~99 180 100~999 2700
2.具体那个数
num=start+(n-1)/digte;
3.数中的那个值
m=(n-1)%digte;
 */