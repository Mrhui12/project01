package com.tang.leetcode1.sort;

import java.util.Arrays;

public class Quciksort {

    public void quickSort(int[] nums, int l, int r) {//l=0 r=nums.length
        if (l+1>= r) return;
        int first = l, last = r-1 , key = nums[first];//用一个临时变量保存初始值
        while (first < last) {
            while (first < last && nums[last] >= key)
                last--;
            nums[first] = nums[last];
            while (first < last && nums[first] <= key) {
                ++first;
            }
            nums[last] = nums[first];
        }
        nums[first]=key;
        quickSort(nums,l,first);
        quickSort(nums,first+1,r);

    }

//    public static void main(String[] args) {
//        int[] nums={3,2,1,5,6,4};
//        System.out.println(Arrays.toString(quickSort(nums,0,nums.length)));
//
//    }
}
