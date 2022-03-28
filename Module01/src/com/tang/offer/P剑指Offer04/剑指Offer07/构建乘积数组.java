package com.tang.offer.P剑指Offer04.剑指Offer07;

import java.util.Arrays;
import java.util.HashMap;

public class 构建乘积数组 {
    public static int[] constructArr(int[] a) {
        int n = a.length;
        if (n == 0) return new int[0];
        int[] b = new int[n];
        b[0] = 1;
        for (int i = 1; i < n; i++) {
            b[i] = b[i - 1] * a[i];
        }
        int temp = 1;
        for (int i = n - 2; i >=0 ; i--) {
            temp *= a[i + 1];
            b[i] *= temp;
        }
        return b;
    }

}
/*
左右来回遍历两次
左边边界外为1~n-1 右遍历为 n-2~0;
 b[0]=1;b[i]=b[i-1]*a[i-1];  第一次遍历为取左边的数累乘
 第二次遍历为取右边的数累乘；
 第二次需要用一个临时变量保存结果
 再用左边的乘右边的；
 */