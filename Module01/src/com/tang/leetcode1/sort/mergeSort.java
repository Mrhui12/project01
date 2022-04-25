package com.tang.leetcode1.sort;

public class mergeSort {
    public void mergeSort(int[] nums,int l,int r,int[] temp){
        if (l+1>=r)return;
        //divide
        int m=(l+r)>>1;
        mergeSort(nums,l,m,temp);
        mergeSort(nums,m,r,temp);
        //conquer
        int p=l,q=m,i=l;
        while (p<m||q<r){
            if (q>=r||(p<m&&nums[p]<=nums[q])){
                temp[i++]=nums[p++];
            }else {
                temp[i++]=nums[q++];
            }
        }
            for (int i1 = l; i < r; i++) {
                nums[i1]=temp[i1];
            }
        }


}
