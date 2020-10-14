package com.lib.algorithm.dp.fibonacci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BruteForceRecursiveFibTest {
    private BruteForceRecursiveFib fib;

    @BeforeEach
    void setUp() {
        fib = new BruteForceRecursiveFib();
    }

    @Test
    void should_return_correct_fibonacci_results() {
        assertEquals(0, fib.get(0));
        assertEquals(1, fib.get(1));
        assertEquals(1, fib.get(2));
        assertEquals(2, fib.get(3));
        assertEquals(5, fib.get(5));
        assertEquals(8, fib.get(6));
        assertEquals(13, fib.get(7));
    }
}