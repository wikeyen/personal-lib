package com.lib.algorithm.lcs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestCommonSubStringTest {

    private LongestCommonSubString lcs;

    @BeforeEach
    void setUp() {
        lcs = new LongestCommonSubString();
    }

    @Test
    void should_return_0_when_findRecursively_given_one_input_is_empty() {
        String str1 = "";
        String str2 = "abcdef";
        String str3 = "asdfasdf";
        String str4 = "";
        int expected = 0;

        int res1 = lcs.findRecursively(str1, str2);
        int res2 = lcs.findRecursively(str3, str4);

        assertEquals(expected, res1);
        assertEquals(expected, res2);
    }

    @Test
    void should_return_0_when_findDPRecursively_given_one_input_is_empty() {
        String str1 = "";
        String str2 = "abcdef";
        String str3 = "asdfasdf";
        String str4 = "";
        int expected = 0;

        int res1 = lcs.findByTopDownDPRecursively(str1, str2);
        int res2 = lcs.findByTopDownDPRecursively(str3, str4);

        assertEquals(expected, res1);
        assertEquals(expected, res2);
    }

    @Test
    void should_return_0_when_findByBottomUpDP_given_one_input_is_empty() {
        String str1 = "";
        String str2 = "abcdef";
        String str3 = "asdfasdf";
        String str4 = "";
        int expected = 0;

        int res1 = lcs.findByBottomUpDP(str1, str2);
        int res2 = lcs.findByBottomUpDP(str3, str4);

        assertEquals(expected, res1);
        assertEquals(expected, res2);
    }

    @Test
    void should_return_0_when_findByOptimalBottomUpDP_given_one_input_is_empty() {
        String str1 = "";
        String str2 = "abcdef";
        String str3 = "asdfasdf";
        String str4 = "";
        int expected = 0;

        int res1 = lcs.findByOptimalBottomUpDP(str1, str2);
        int res2 = lcs.findByOptimalBottomUpDP(str3, str4);

        assertEquals(expected, res1);
        assertEquals(expected, res2);
    }

    @Test
    void should_return_4_when_findRecursively() {
        String str1 = "abcd";
        String str2 = "abcdef";
        int expected = 4;

        int res = lcs.findRecursively(str1, str2);

        assertEquals(expected, res);
    }

    @Test
    void should_return_4_when_findDPRecursively() {
        String str1 = "abcd";
        String str2 = "abcdef";
        int expected = 4;

        int res = lcs.findByTopDownDPRecursively(str1, str2);

        assertEquals(expected, res);
    }

    @Test
    void should_return_4_when_findByBottomUpDP() {
        String str1 = "abcd";
        String str2 = "abcdef";
        int expected = 4;

        int res = lcs.findByBottomUpDP(str1, str2);

        assertEquals(expected, res);
    }

    @Test
    void should_return_4_when_findByOptimalBottomUpDP() {
        String str1 = "abcd";
        String str2 = "abcdef";
        int expected = 4;

        int res = lcs.findByOptimalBottomUpDP(str1, str2);

        assertEquals(expected, res);
    }

    @Test
    void should_return_3_when_findRecursively() {
        String str1 = "bcd";
        String str2 = "abcdef";
        int expected = 3;

        int res = lcs.findRecursively(str1, str2);

        assertEquals(expected, res);
    }

    @Test
    void should_return_3_when_findDPRecursively() {
        String str1 = "bcd";
        String str2 = "abcdef";
        int expected = 3;

        int res = lcs.findByTopDownDPRecursively(str1, str2);

        assertEquals(expected, res);
    }

    @Test
    void should_return_3_when_findByBottomUpDP() {
        String str1 = "bcd";
        String str2 = "abcdef";
        int expected = 3;

        int res = lcs.findByBottomUpDP(str1, str2);

        assertEquals(expected, res);
    }

    @Test
    void should_return_3_when_findByOptimalBottomUpDP() {
        String str1 = "bcd";
        String str2 = "abcdef";
        int expected = 3;

        int res = lcs.findByOptimalBottomUpDP(str1, str2);

        assertEquals(expected, res);
    }

    @Test
    void should_return_2_when_findRecursively() {
        String str1 = "agfbc09d";
        String str2 = "abcdef";
        int expected = 2;

        int res = lcs.findRecursively(str1, str2);

        assertEquals(expected, res);
    }

    @Test
    void should_return_2_when_findDPRecursively() {
        String str1 = "agfbc09d";
        String str2 = "abcdef";
        int expected = 2;

        int res = lcs.findByTopDownDPRecursively(str1, str2);

        assertEquals(expected, res);
    }

    @Test
    void should_return_2_when_findByBottomUpDP() {
        String str1 = "agfbc09d";
        String str2 = "abcdef";
        int expected = 2;

        int res = lcs.findByBottomUpDP(str1, str2);

        assertEquals(expected, res);
    }

    @Test
    void should_return_2_when_findByOptimalBottomUpDP() {
        String str1 = "agfbc09d";
        String str2 = "abcdef";
        int expected = 2;

        int res = lcs.findByOptimalBottomUpDP(str1, str2);

        assertEquals(expected, res);
    }
}