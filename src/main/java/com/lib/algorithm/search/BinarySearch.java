package com.lib.algorithm.search;

public class BinarySearch {
    public int findTheFirstMatching(int[] arr, int value) {
        if (arr.length == 0) {
            return -1;
        }

        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (arr[mid] > value) {
                high = mid - 1;
            } else if (arr[mid] < value) {
                low = mid + 1;
            } else {
                if (mid == 0 || arr[mid - 1] != value) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }

    public int findTheLastMatching(int[] arr, int value) {
        if (arr.length == 0) {
            return -1;
        }

        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (arr[mid] > value) {
                high = mid - 1;
            } else if (arr[mid] < value) {
                low = mid + 1;
            } else {
                if (mid == arr.length - 1 || arr[mid + 1] != value) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }

        return -1;
    }

    public int findTheFistEqualOrGreaterThan(int[] arr, int value) {
        if (arr.length == 0) {
            return -1;
        }

        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (arr[mid] >= value) {
                if (mid == 0 || arr[mid - 1] < value) {
                    return mid;
                }
                high = mid - 1;
            } else if (arr[mid] < value) {
                low = mid + 1;
            }
        }

        return -1;
    }

    public int findTheLastEqualOrSmallerThan(int[] arr, int value) {
        if (arr.length == 0) {
            return -1;
        }

        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (arr[mid] > value) {
                high = mid - 1;
            } else if (arr[mid] <= value) {
                if (mid == arr.length - 1 || arr[mid + 1] > value) {
                    return mid;
                }
                low = mid + 1;
            }
        }

        return -1;
    }
}
