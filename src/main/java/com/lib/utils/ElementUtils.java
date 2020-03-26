package com.lib.utils;

public class ElementUtils {
    public static void swap(int[] numbers, int i, int j) {
        int cur = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = cur;
    }
}
