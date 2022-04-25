package com.tang.leetcode1.sort;



public class insertionSort {
    public void insertionSort(int[] nums,int n){
        for (int i = 0; i < n; i++) {
            for (int j=i;j>0&&nums[j]<nums[j-1];--j){
                swap(nums[j],nums[j-1]);
            }
        }
    }

    private void swap(int num, int num1) {
        int temp=num;
        num=num1;
        num1=temp;
    }
}
