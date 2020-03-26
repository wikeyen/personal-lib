package com.lib.algorithm.sort;

import java.util.List;

public class TopN<T extends Comparable> {

    public T findTopNth(int rank, List<T> arr) {
        int start = 0;
        int end = arr.size() - 1;

        return findTopNthValue(rank, arr, start, end);
    }

    private T findTopNthValue(int index, List<T> arr, int start, int end) {
        int pivot = partition(arr, start, end);
        if (index == pivot) {
            return arr.get(pivot);
        }

        return index > pivot ?
                findTopNthValue(index, arr, pivot + 1, end)
                :
                findTopNthValue(index, arr, start, pivot - 1);
    }

    private int partition(List<T> arr, int start, int end) {
        T pivotValue = arr.get(end);
        int low = start;

        for (int i = start; i <= end - 1; i++) {
            if (arr.get(i).compareTo(pivotValue) < 0) {
                swap(arr, i, low++);
            }
        }

        swap(arr, low, end);
        return low;
    }

    private void swap(List<T> arr, int i, int low) {
        T temp = arr.get(i);
        arr.set(i, arr.get(low));
        arr.set(low, temp);
    }
}
