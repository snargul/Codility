package com.codility.application.maxdoubleslicesum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxDoubleSliceSumTest {

    @Test
    void testSolution() {
        assertEquals(17, MaxDoubleSliceSum.solution(new int[]{3, 2, 6, -1, 4, 5, -1, 2}));
        assertEquals(15, MaxDoubleSliceSum.solution(new int[]{3, 0, 6, -1, 4, 5, -1, 2}));
        assertEquals(10, MaxDoubleSliceSum.solution(new int[]{0, 10, -5, -2, 0}));
    }
}
