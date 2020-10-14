package com.lib.algorithm.dp.fibonacci;

public class BruteForceDPRecursiveFib {
    public int get(int index) {
        int[] dp = new int[index + 1];
        return get(dp, index);
    }


    public int get(int[] dp, int index) {
        if (index < 2) {
            return index;
        }

        if (dp[index] != 0) {
            return dp[index];
        }

        dp[index] = get(dp, index - 1) + get(dp, index - 2);
        return dp[index];
    }
}