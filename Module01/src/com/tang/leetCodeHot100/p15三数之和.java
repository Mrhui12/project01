package com.tang.leetCodeHot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p15三数之和 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length < 3) return res;
        Arrays.sort(nums);
        if (nums[0] > 0 || nums[nums.length - 1] < 0) return res;
//        int r = nums.length - 1;必须放在里面 放在外面会到新的i的时候r还是原来的
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > 0) return res;
            if (i > 0 && nums[i] == nums[i - 1]) continue;//为了去除重复解
            int l = i + 1,r=nums.length-1;//没到下一个I 就重新更新L R
            while (l < r) {
                int temp = nums[i] + nums[l] + nums[r];
                if (temp == 0) {
                    List<Integer> list = new ArrayList<>();
                    //添加正确解
                    list.add(nums[i]);
                    list.add(nums[r]);
                    list.add(nums[l]);
                    res.add(list);
                    while (l < r && nums[r - 1] == nums[r]) r--;//去除重复解
                    while (l < r && nums[l + 1] == nums[l]) l++;
                    r--;
                    l++;
                } else if (temp < 0) l++;
                else r--;
            }
        }
        return res;
    }
}
/*
总体思路就是先判断 长度是否小于3
排序
排序后判断 第一个值 和最后一个值和0相比
i遍历数据 并且判断当前nums[i]是否大于0 是就直接返回结果 因为后面的肯定也是大的
判断当前的是不是和上一个相等 是的话就continue;
设置左右边界 l=i+1;r=length-1;
当l<r 时判断三树之和
等于 加入答案  如果nums[r-1]=nums[r] r--;去除重复答案
之后在l++,r--;

不同于就 大就r--;小就l++;
 */