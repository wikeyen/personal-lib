package com.lib.algorithm.sort;

import com.lib.utils.ElementUtil;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BubbleSortTest {
    @Test
    void should_return_a_sorted_arr_when_sort_given_an_unsorted_array_with_1000_element_in_a_range_of_0_to_1000() {
        int[] numbers = ElementUtil.getIntNumbers(1000, 0, 1000);
        int[] expect = new int[numbers.length];
        System.arraycopy(numbers, 0, expect, 0, numbers.length);
        Arrays.sort(expect);
        Sortable bubble = new BubbleSort();

        bubble.sort(numbers);
        assertArrayEquals(expect, numbers);
    }
}