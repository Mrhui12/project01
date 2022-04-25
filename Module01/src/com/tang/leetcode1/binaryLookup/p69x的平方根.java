package com.tang.leetcode1.binaryLookup;

public class p69x的平方根 {
    public int mySqrt(int x){
        if (x==0)return 0;
      int l=1,r=x,mid=0,sqrt=0;
      while (l<=r){
          mid =(l+r)>>1;
          sqrt=x/mid;
          if (sqrt==mid)return mid;
          if (sqrt>mid)l=mid+1;
          else r=mid-1;
      }
      return r;
    }
}
/*
        基础的二分查找
        思路就是求 f (x) = x
                        ^2 − a = 0 的解
 */