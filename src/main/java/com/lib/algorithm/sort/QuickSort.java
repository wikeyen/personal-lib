package com.lib.algorithm.sort;

import com.lib.utils.ElementUtils;

public class QuickSort implements Sortable {
    @Override
    public void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private void sort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int pivot = getPartition(arr, start, end);
        sort(arr, start, pivot - 1);
        sort(arr, pivot + 1, end);
    }

    private int getPartition(int[] arr, int start, int end) {
        int pivotValue = arr[end];
        int left = start;
        int right = end - 1;

        for (int i = left; i <= right; i++) {
            if (arr[i] < pivotValue) {
                ElementUtils.swap(arr, start, i);
                start++;
            }
        }

        ElementUtils.swap(arr, start, end);
        return start;
    }
}
