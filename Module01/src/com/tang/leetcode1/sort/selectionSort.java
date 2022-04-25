package com.tang.leetcode1.sort;



public class selectionSort {
    public void selection_sort(int[] nums,int n){
        int mid;
        for (int i = 0; i < n - 1; i++) {
            mid=i;
            for (int j = i+1; j < n; j++) {
                if (nums[j]<nums[mid]){
                    mid=j;
                }
            }
            swap(nums[mid],nums[i]);
        }
    }
    private void swap(int num, int num1) {
        int temp=num;
        num=num1;
        num1=temp;
    }
}
