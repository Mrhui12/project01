package com.tang.leetcode1.数学;

public class p470rand {
    public int rand10() {
        int num = (rand7() - 1) * 7 + rand7();
        while (num >10 ) {
            num = (rand7() - 1)*7 + rand7();
        }
        return num;
    }

    private int rand7() {
        return 7;
    }
}
