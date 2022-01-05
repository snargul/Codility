package com.codility.application.passingcars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassingCarsTest {

    @Test
    void testSolution() {
        assertEquals(5, PassingCars.solution(new int[]{0, 1, 0, 1, 1}));
        assertEquals(4, PassingCars.solution(new int[]{0, 1, 0, 0, 1}));
        assertEquals(1, PassingCars.solution(new int[]{0, 1, 0, 0, 0}));
        assertEquals(-1, PassingCars.solution(new int[]{0, 0, 0, 0, 0}));
        assertEquals(-1, PassingCars.solution(new int[]{1, 1, 1, 1, 1}));
        assertEquals(-1, PassingCars.solution(new int[]{1, 1, 1, 0, 0}));
        assertEquals(1, PassingCars.solution(new int[]{1, 1, 1, 0, 1}));
    }
}
