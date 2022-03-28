package leetcode;

import java.util.*;

public class Solution {
  public String findLongestWord(String s, List<String> dictionary) {
    String res = "";
    for (String t : dictionary

    ) {
      int i = 0, j = 0;
      while (i < t.length() && j < s.length()) {
        if (t.charAt(i) == s.charAt(j)) {
          i++;
        }
        j++;
      }
      if (i == t.length()) {
        if (t.length() > res.length() || t.length() == res.length() && t.compareTo(res) < 0) {
          res = t;
        }
      }


    }
    return res;
  }
}



//    public  static int[] sortSquares(int[] nums) {
//        int l = 0;
//        int r = nums.length - 1;
//        int index =nums.length - 1 ;
//        int[] result = new int[index+1];
//        while (l <=r) {
//            if (nums[l] * nums[l] > nums[r] * nums[r]) {
//                result[index--] = nums[l] * nums[l++];
//
//            } else {
//                result[index--] = nums[r] * nums[r--];
//
//            }
//        }
//        return result;
//    }






