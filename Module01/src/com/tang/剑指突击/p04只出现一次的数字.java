package com.tang.剑指突击;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("ALL")
public class p04只出现一次的数字 {
    public int singleNumber(int[] nums) {
      int one=0,two=0;
        for (int num : nums) {
            one=one^num&(~two);
            two=two^num&(~one);
        }
        return one;
    }
}
