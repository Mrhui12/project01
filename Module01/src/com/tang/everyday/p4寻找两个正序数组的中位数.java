package com.tang.everyday;
@SuppressWarnings("All")
public class p4寻找两个正序数组的中位数 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1=nums1.length,len2=nums2.length;
        int k1=(len1+len2+1)/2,k2=(len1+len2+2)/2;
        return (helper(nums1,0,len1-1,nums2,0,len2-1,k1)+ helper(nums1,0,len1-1,nums2,0,len2-1,k2))/2;
    }
    private double helper(int[] nums1,int start1,int end1,int[] nums2,int start2,int end2,int k){
        int length1=end1-start1+1;
        int length2=end2-start2+1;
        if(length1>length2) return helper(nums2,start2,end2,nums1,start1,end1,k);
        if(length1==0) return nums2[start2+k-1];
        if(k==1) return Math.min(nums1[start1],nums2[start2]);
        int index1=start1+Math.min(k/2,length1)-1;
        int idnex2=start2+Math.min(k/2,length2)-1;
        if(nums1[index1]>nums2[idnex2]){
            return helper(nums1,start1,end1,nums2,idnex2+1,end2,k-(idnex2-start2+1));
        }else
        { return helper(nums1,index1+1,end1,nums2,start2,end2,k-(index1-start1+1));
        }
    }
}
