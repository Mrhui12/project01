package com.tang.leetcode1.数学;

import java.util.Random;

@SuppressWarnings("all")
public class p384打乱数组 {
    int n;
    int[] nums;
    Random random = new Random();

    public void Solution(int[] _nums) {
        nums = _nums;
        n = nums.length;
    }

    public int[] reset() {
        return nums;
    }

    public int[] shuffle() {
        int arr[] = nums.clone();
        for (int i = 0; i < n; i++) {
            swap(arr, i, i + random.nextInt(n - i));
        }
        return arr;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
/*
        先定义几个全局变量
        int[] num;int n;Random random=new Random();
        第一个函数初始化 n=nums.length; num=nums;
        第二个函数 直接返回 num;
        第三函数洗牌  int[] arr=num.clone();
        然后遍历arr  交换  swap(arr,i,i+random.nextInt(n-i));
        返回arr;
 */