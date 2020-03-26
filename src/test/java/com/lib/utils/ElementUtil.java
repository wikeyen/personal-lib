package com.lib.utils;

public class ElementUtil {
    public static int[] getIntNumbers(int amount, int min, int max) {
        int[] res = new int[amount];

        for (int i = 0; i < res.length; i++) {
            res[i] = (int) (Math.random() * (max - min) + min);
        }

        return res;
    }
}
