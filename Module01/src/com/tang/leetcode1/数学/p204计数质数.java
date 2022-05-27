package com.tang.leetcode1.数学;

import java.util.Arrays;

@SuppressWarnings("all")
public class p204计数质数 {
    public int countPrimes(int n) {
        if (n <= 2) return 0;
        boolean[] prime = new boolean[n];
        Arrays.fill(prime, true);
        int i = 3, sqrtn = (int) Math.sqrt(n), count = n / 2;
        while (i <= sqrtn) {
            for (int j = i * i; j < n; j += 2 * i) {
                if (prime[j]) {
                    --count;
                    prime[j] = false;
                }

            }
            do {
                i += 2;
            }
            while (i <= sqrtn && !prime[i]);


        }
        return count;
    }
}
/*
            当你<=2直接返回 0
            创建一个是否遍历数组
            让所有的为true;
            初始化为 i=3; n的平方根  count=n/2;
            当 i<=sqrtn  循环
            让 j==i*i ;j<n  j+=i*2;
            如果 prime[j]==true 让它为false 并且结果减减
            循环之后 得改变 i的值
            当 prime[i]==false &&i<=sqrtn的条件下 让 i+=2;
 */