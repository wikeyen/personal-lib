package com.lib.algorithm.dp.fibonacci;

public class DpFib {
    public int get(int index) {
        if (index == 0) {
            return 0;
        }

        int[] dp = new int[index + 1];
        dp[1] = 1;

        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[index];
    }
}
