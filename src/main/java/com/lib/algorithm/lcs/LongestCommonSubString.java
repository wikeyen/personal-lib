package com.lib.algorithm.lcs;

import org.apache.commons.lang3.StringUtils;

public class LongestCommonSubString {

    public int findRecursively(String str1, String str2) {
        if (StringUtils.isAnyBlank(str1, str2)) {
            return 0;
        }

        return findRecursively(str1, str2, 0, 0, 0);
    }

    private int findRecursively(String str1, String str2, int i1, int i2, int count) {
        if (i1 == str1.length() || i2 == str2.length()) {
            return count;
        }

        if (str1.charAt(i1) == str2.charAt(i2)) {
            count = findRecursively(str1, str2, i1 + 1, i2 + 1, count + 1);
        }

        int c1 = findRecursively(str1, str2, i1, i2 + 1, 0);
        int c2 = findRecursively(str1, str2, i1 + 1, i2, 0);
        return Math.max(count, Math.max(c1, c2));
    }

    public int findByTopDownDPRecursively(String str1, String str2) {
        if (StringUtils.isAnyBlank(str1, str2)) {
            return 0;
        }

        Integer[][][] dp = new Integer[str1.length()][str2.length()][Math.min(str1.length(), str2.length())];

        return findByTopDownDPRecursively(dp, str1, str2, 0, 0, 0);
    }

    private int findByTopDownDPRecursively(Integer[][][] dp, String str1, String str2, int i1, int i2, int count) {
        if (i1 == str1.length() || i2 == str2.length()) {
            return count;
        }

        if (dp[i1][i2][count] == null) {
            int c1 = count;
            if (str1.charAt(i1) == str2.charAt(i2)) {
                c1 = findByTopDownDPRecursively(dp, str1, str2, i1 + 1, i2 + 1, count + 1);
            }

            int c2 = findByTopDownDPRecursively(dp, str1, str2, i1, i2 + 1, 0);
            int c3 = findByTopDownDPRecursively(dp, str1, str2, i1 + 1, i2, 0);
            dp[i1][i2][count] = Math.max(c1, Math.max(c2, c3));
        }

        return dp[i1][i2][count];
    }


    /**
     * O(n) m * n, O(s) m * n
     *
     * @param str1
     * @param str2
     * @return
     */
    public int findByBottomUpDP(String str1, String str2) {
        if (StringUtils.isAnyBlank(str1, str2)) {
            return 0;
        }

        // in case two strings do not start with the same character, dp[0][0] will always be 0
        int[][] dp = new int[str1.length() + 1][str2.length() + 1];
        int maxLength = 0;
        int x = 0;

        for (int i = 1; i <= str1.length(); i++) {
            for (int j = 1; j <= str2.length(); j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) { // index for strings are always (1 + index of dp)
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (maxLength < dp[i][j]) {
                        x = i;
                        maxLength = dp[i][j];
                    }
                }
            }
        }

        printLCS(str1, maxLength, x);

        return maxLength;
    }

    private void printLCS(String str1, int maxLength, int x) {
        StringBuilder sb = new StringBuilder();
        x = x - 1;
        for (int len = maxLength; len > 0; len--) {
            sb.append(str1.charAt(x--));
        }

        System.out.println(sb.reverse().toString());
    }


    /**
     * O(n) m * n, O(s) n
     *
     * @param str1
     * @param str2
     * @return
     */
    public int findByOptimalBottomUpDP(String str1, String str2) {
        if (StringUtils.isAnyBlank(str1, str2)) {
            return 0;
        }

        // two - one dimension array, one is to store the previous results, one is to store current
        int[][] dp = new int[2][str2.length() + 1];
        int maxLength = 0;

        for (int i = 1; i <= str1.length(); i++) {
            for (int j = 1; j <= str2.length(); j++) {
                dp[i % 2][j] = 0;
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) { // index for strings are always (1 + index of dp)
                    dp[i % 2][j] = dp[(i - 1) % 2][j - 1] + 1;
                    maxLength = Math.max(maxLength, dp[i % 2][j]);
                }
            }
        }

        return maxLength;
    }


}
