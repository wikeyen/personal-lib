package com.lib.algorithm.sort;

import com.lib.utils.ElementUtils;

public class BubbleSort implements Sortable {
    public void sort(int[] numbers) {
        for (int i = numbers.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    ElementUtils.swap(numbers, j, j + 1);
                }
            }
        }
    }
}
