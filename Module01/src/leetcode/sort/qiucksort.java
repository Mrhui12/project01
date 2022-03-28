package leetcode.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class qiucksort {
    public static void main(String[] args) {
        int[] nums = {2, 45, 1, 6, 9, 3};
        quickSort(nums, 0, nums.length - 1);

        System.out.println(Arrays.toString(nums));

    }


    public static void quickSort(int[] nums, int l, int r) {
        if (l >= r) return;
        int i = l, j = r;

        int tmp = nums[i];
        while (i < j) {
            while (tmp <= nums[j] && i < j) j--;
            nums[i]=nums[j];//这种方法更好理解
            while (nums[i] <= tmp && i < j) i++;
            nums[j]=nums[i];
//            tmp = nums[j];
//            nums[j] = nums[i];
//            nums[i] = tmp;
        }
        nums[i] = tmp;//
//        nums[l] = tmp;//????到最后I==J
//        strs[i] = strs[l];
//        strs[l] = tmp;//?????
        quickSort(nums, l, i -1);
        quickSort(nums, i + 1, r);
    }

}
