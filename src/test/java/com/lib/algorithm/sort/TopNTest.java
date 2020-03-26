package com.lib.algorithm.sort;

import com.lib.utils.ElementUtil;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TopNTest {

    @Test
    void should_find_the_5th_largest_number_when_findTopNth_given_an_array() {
        List<Integer> numbers = ElementUtil.getIntegerNumbers(10, 0, 10);
        Collections.sort(numbers);
        TopN<Integer> topN = new TopN<>();
        int rank = 5;

        Integer top5thValue = topN.findTopNthValue(rank, numbers);

        assertEquals(numbers.get(rank), top5thValue);
    }
}