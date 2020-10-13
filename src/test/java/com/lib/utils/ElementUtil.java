package com.lib.utils;

import java.util.ArrayList;
import java.util.List;

public class ElementUtil {
    public static int[] getIntNumbers(int amount, int min, int max) {
        int[] res = new int[amount];

        for (int i = 0; i < res.length; i++) {
            res[i] = (int) (Math.random() * (max - min) + min);
        }

        return res;
    }

    public static List<Integer> getIntegerNumbers(int amount, int min, int max) {
        List<Integer> res = new ArrayList<>(amount);

        for (int i = 0; i < amount; i++) {
            res.add((int) (Math.random() * (max - min) + min));
        }

        return res;
    }
}
