package com.codility.application.minavgtwoslice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinAvgTwoSliceTest {

    @Test
    void testSolution() {
        assertEquals(1, MinAvgTwoSlice.solution(new int[]{4, 2, 2, 5, 1, 5, 8}));
    }
}
