package com.tang.leetcode1.sort;

public class bubbleSort {
    public void bubble_sort(int[] nums, int n) {
        boolean swapped;
        for (int i = 1; i < n; i++) {
            swapped = false;
            for (int j = 1; j < n - i + 1; j++) {
                if (nums[j] < nums[j - 1]) {
                    swap(nums[j], nums[j - 1]);
                    swapped = true;
                }
            }
            if (!swapped)break;
        }
    }
        private void swap ( int num, int num1){
            int temp = num;
            num = num1;
            num1 = temp;
        }
    }
/*
     每排一次 最大的在后面 所以之需要到n-i+1
     不用排的时候设置一个boolean值

 */