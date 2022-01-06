package com.codility.application.missinginteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingIntegerTest {

    @Test
    void testSolution() {
        int[] testValueList = {1, 3, 6, 4, 1, 2};
        assertEquals(5, MissingInteger.solution(testValueList)) ;
        assertEquals(4, MissingInteger.solution(new int[]{1, 2, 3})) ;
        assertEquals(1, MissingInteger.solution(new int[]{-1, -3})) ;
    }
}
