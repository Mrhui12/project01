package com.tang.leetcode1.贪心;

public class p605种花为题 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int i = 0;
        while (i < len) {
            if (flowerbed[i] == 1)
                i += 2;
            else if (i == len - 1 || flowerbed[i + 1] == 0) {
                i += 2;
                n--;
            } else i += 3;
        }
        return n <= 0;

    }
}
/*
    思路：
        贪心
       当当前下标在索引范围内 判断
       1：当当前为1  i+=2;
       2.1 当前为最后一个值 或者当前值的下一个值也为0 n--i+=2;\
       2.2 i+=3;
 */