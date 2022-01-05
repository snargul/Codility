package com.codility.application.oddoccurencesinarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddOccurencesInArrayTest {

    @Test
    void testSolution() {
        int[] testValueList = {9, 3, 9, 3, 9, 7, 9};
        assertEquals(7, OddOccurencesInArray.solution(testValueList));
    }

}
