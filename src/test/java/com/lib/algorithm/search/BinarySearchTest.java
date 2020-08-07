package com.lib.algorithm.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {
    @Test
    void should_return_4_when_findTheFirstMatching_given_an_array_with_duplicate_numbers() {
        int[] arr = {1, 2, 3, 4, 5, 5, 5, 5, 5, 6, 7, 8};

        BinarySearch binarySearch = new BinarySearch();
        int value = 5;
        int res = binarySearch.findTheFirstMatching(arr, value);

        assertEquals(4, res);
    }

    @Test
    void should_return_8_when_findTheLastMatching_given_an_array_with_duplicate_numbers() {
        int[] arr = {1, 2, 3, 4, 5, 5, 5, 5, 5, 6, 7, 8};

        BinarySearch binarySearch = new BinarySearch();
        int value = 5;
        int res = binarySearch.findTheLastMatching(arr, value);

        assertEquals(8, res);
    }

    @Test
    void should_return_4_when_findTheFistEqualOrGreaterThan_given_an_array_with_duplicate_numbers() {
        int[] arr = {1, 2, 3, 4, 5, 5, 5, 5, 5, 6, 7, 8};

        BinarySearch binarySearch = new BinarySearch();
        int value = 5;
        int res = binarySearch.findTheFistEqualOrGreaterThan(arr, value);

        assertEquals(4, res);
    }

    @Test
    void should_return_4_when_findTheLastEqualOrSmallerThan_given_an_array_with_duplicate_numbers() {
        int[] arr = {1, 2, 3, 4, 5, 5, 5, 5, 5, 6, 7, 8};

        BinarySearch binarySearch = new BinarySearch();
        int value = 5;
        int res = binarySearch.findTheLastEqualOrSmallerThan(arr, value);

        assertEquals(8, res);
    }
}