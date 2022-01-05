package com.codility.application.countnondivisible;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountNonDivisibleTest {

    @Test
    void testSolution() {
        assertArrayEquals(new int[]{2, 4, 3, 2, 0}, CountNonDivisible.solution(new int[] {3, 1, 2, 3, 6}));
    }
}
