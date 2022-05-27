package com.tang.leetcode1;

import com.tang.leetcode1.douleindex.p167两数之和输入有序数组;
import com.tang.leetcode1.位运算.p467数字的补数;
import com.tang.leetcode1.数学.p384打乱数组;
import org.junit.Test;

import java.util.Arrays;

public class mytest {
    @Test
    public void test(){
       int[] arr={2,7,11,15};
        p167两数之和输入有序数组 test1 = new p167两数之和输入有序数组();
        System.out.println(Arrays.toString(test1.towsum2(arr,9)));
    }
    @Test
    public void test384(){
        int[] arr={2,7,11,15};
        p384打乱数组 p384 = new p384打乱数组();
        p384.Solution(arr);
        System.out.println(Arrays.toString(p384.shuffle()));
    }
    @Test
    public void test476(){

        p467数字的补数 p467 = new p467数字的补数();
        System.out.println(p467.findComplement(5));
    }
}
