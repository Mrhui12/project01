package com.tang.offer.P剑指Offer04.剑指Offer07;

public class 数值的整数次方 {
    public double myPow(double x, int n) {
        if (x == 0) return 0;

        double res = 1.0;
        long b=n;
        if (b < 0) {
            b = -b;
            x = 1 / x;
        }
        while (b > 0) {
            if ((b & 1) == 1)//与运算 自动换成二进制 判断最低位是否为一
                res *= x;//
                b >>= 1;//右边移动一位
                x *= x;


        }
        return res;
    }


}