package com.tang.offer.P剑指Offer04.剑指Offer07;

public class 把字符串转换成整数 {
    public int strToInt(String str) {
        int n = str.length();
        int res = 0, sign = 1, i = 1, bndry = Integer.MAX_VALUE / 10;
        char[] c = str.trim().toCharArray();
        if (c[0] == '-') sign = -1;
        else if (c[0] != '+') i = 0;
        for (int j = i; j < str.length(); j++) {
            if (c[j] < '0' || c[j] > '9') break;
            if (res > bndry || res == bndry && c[j] > '7') return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            res = res * 10 + c[j] - '0';

        }
        return res;
    }
}
/*
将字符串用trim()函数 和toCharArray()函数转化为最右边为非空格的字符数组
判断第一个 字符 是- 还是+ 或者就是数 可以先规定一种 如果 有符号i=1  无符号 i=0
初始化 res=0
循环 从 i开始
判断下一步会不会超出最大范围 res>最大值除以10 或者等于切当前字符大于7
res=res*10+c[i] 更新结果

 */