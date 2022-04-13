package com.tang.leetCodeHot100;

public class p75颜色分类 {
    /* public void sortColors(int[] nums) {
         int n = nums.length, l = 0, index = 0;
         while (index < n) {
             if (nums[index] == 0) {
                 swap(nums, l, index);
                 l++;
                 index++;
             } else if (nums[index] == 1) index++;
             else {
                 n--;
                 swap(nums, n, index);
             }
         }

     }

     private void swap(int[] nums, int l, int index) {
         int temp = nums[l];
         nums[l] = nums[index];
         nums[index] = temp;
     }

     */
    public void sortColors(int[] nums) {
        qiuck_sort(nums, 0, nums.length);

    }

    private void qiuck_sort(int[] nums, int l, int r) {
        if (l + 1 >= r) {
            return;
        }
        int first = l, last = r - 1, key = nums[first];
        while (first < last) {
            while (first < last && nums[last] >= key) {
                last--;
            }
            nums[first] = nums[last];
            while (first < last && nums[first] <= key) ++first;
            nums[last] = nums[first];

        }
        nums[first] = key;
        qiuck_sort(nums, l, first);
        qiuck_sort(nums, first + 1, r);
    }

}
/*
快速排序的思想
如果是0 就和first交换 并且first++; index++;
如果是1 index++；
如果是2 n-- 交换；
 */