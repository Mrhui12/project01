package com.tang.leetcode1.sort;

public class p75颜色分类 {
    public void sortColors(int[] nums){
        qucik_sort(nums,0,nums.length);
    }

    private void qucik_sort(int[] nums, int l, int r) {
        if (l+1>=r)return;
        int first=l,last=r-1,key=nums[first];
        while (first<last){
            while (first<last&&nums[last]>=key)last--;
            nums[first]=nums[last];
            while (first<last&&nums[first]<key)first++;
            nums[last]=nums[first];
        }
        nums[first]=key;
        qucik_sort(nums,l,first);
        qucik_sort(nums,first+1,r);
    }
}
/*
        一个很典型的快速排序
 */