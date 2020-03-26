package com.lib.algorithm.sort;

import com.lib.utils.ElementUtil;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TopNTest {

    @Test
    void should_find_the_6th_largest_number_when_findTopNth_given_an_array() {
        List<Integer> numbers = ElementUtil.getIntegerNumbers(1000, 0, 1000);
        Collections.sort(numbers);
        TopN<Integer> topN = new TopN<>();
        int rank = 6;

        Integer top6thValue = topN.findTopNth(rank - 1, numbers);

        assertEquals(numbers.get(rank - 1), top6thValue);
    }
}