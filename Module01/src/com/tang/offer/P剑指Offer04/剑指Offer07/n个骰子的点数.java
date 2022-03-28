package com.tang.offer.P剑指Offer04.剑指Offer07;

import java.util.Arrays;

public class n个骰子的点数 {
    public static double[] dicesProbability(int n) {
        double[] dps = new double[6];

        for (int i = 0; i < 6; i++) {
            dps[i] = 1 / 6.0;
        }

        for (int i = 2; i <= n; i++) {
            double[] temp = new double[5 * i + 1];
            for (int i1 = 0; i1 < dps.length; i1++) {
                for (int i2 = 0; i2 < 6; i2++) {
                    temp[i1 + i2] += dps[i1] / 6.0;
                }
                dps = temp;
            }
        }
        return dps;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(dicesProbability(2)));
    }
}
