package com.lib.algorithm.sort;

public class InsertionSort implements Sortable {
    @Override
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int cur = arr[i];
            for (int j = 0; j < i; j++) {
                if (cur < arr[j]) {
                    System.arraycopy(arr, j, arr, j + 1, i - j);
                    arr[j] = cur;
                    break;
                }
            }
        }
    }
}

