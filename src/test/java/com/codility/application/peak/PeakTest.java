package com.codility.application.peak;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PeakTest {

    @Test
    void testSolution() {
        assertEquals(3, Peak.solution(new int[]{1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 5, 2}));
    }
}
