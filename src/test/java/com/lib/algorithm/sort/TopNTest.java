package com.lib.algorithm.sort;

import com.lib.utils.ElementUtil;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TopNTest {

    @Test
    void should_find_the_6th_largest_number_when_findTopNth_given_an_array() {
        long start1 = System.currentTimeMillis();
        List<Integer> numbers = ElementUtil.getIntegerNumbers(500000, 0, 1000);
        TopN<Integer> topN = new TopN<>();
        int rank = 1000;

        long start2 = System.currentTimeMillis();
        Integer top6thValue = topN.findTopNth(rank - 1, numbers);
        System.out.println("whole process takes: " + (System.currentTimeMillis() - start1));
        System.out.println("find top N takes: " + (System.currentTimeMillis() - start2));

        Collections.sort(numbers);
        assertEquals(numbers.get(rank - 1), top6thValue);
    }
}