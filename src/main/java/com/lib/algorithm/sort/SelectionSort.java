package com.lib.algorithm.sort;

import com.lib.utils.ElementUtils;

public class SelectionSort implements Sortable {
    @Override
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[minIndex] > arr[j + 1]) {
                    minIndex = j + 1;
                }
            }
            ElementUtils.swap(arr, i, minIndex);
        }
    }
}
