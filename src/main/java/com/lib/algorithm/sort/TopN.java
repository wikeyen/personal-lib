package com.lib.algorithm.sort;

import java.util.List;

public class TopN<T extends Comparable> {

    public T findTopNthValue(int rank, List<T> arr) {
        int start = 0;
        int end = arr.size() - 1;

        T index = findTopNthIndex(rank, arr, start, end);
        return arr.get((Integer) index - 1);
    }

    private T findTopNthIndex(int rank, List<T> arr, int start, int end) {
        int pivot = partition(arr, start, end);
        if (rank == pivot) {
            return arr.get(pivot);
        }

        return rank > pivot ?
                findTopNthIndex(rank, arr, pivot + 1, end)
                :
                findTopNthIndex(rank, arr, start, pivot - 1);
    }

    private int partition(List<T> arr, int start, int end) {
        T pivotValue = arr.get(end);
        int low = start;

        for (int i = start; i <= end - 1; i++) {
            if (arr.get(i).compareTo(pivotValue) <= 0) {
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
