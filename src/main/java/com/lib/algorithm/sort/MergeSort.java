package com.lib.algorithm.sort;

public class MergeSort implements Sortable {
    @Override
    public void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    public void sort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int pivot = (end + start) / 2;

        sort(arr, start, pivot);
        sort(arr, pivot + 1, end);
        merge(arr, start, pivot, end);
    }

    private void merge(int[] arr, int start, int pivot, int end) {
        int[] res = new int[arr.length];

        int begin = start;
        int left = start;
        int right = pivot + 1;

        while (left <= pivot && right <= end) {
            if (arr[left] <= arr[right]) {
                res[begin] = arr[left];
                left++;
            } else {
                res[begin] = arr[right];
                right++;
            }
            begin++;
        }

        while (left > pivot && right <= end) {
            res[begin] = arr[right];
            begin++;
            right++;
        }
        while (left <= pivot && right > end) {
            res[begin] = arr[left];
            begin++;
            left++;
        }


        System.arraycopy(res, start, arr, start, end + 1 - start);
    }
}
