package com.codility.argoexpert.largestarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class LargestArrayTest {

    @Test
    void testSolution() {
        int[] testValueList1 = {2, 3, 4, 5, 6};
        assertArrayEquals(new int[]{2, 6}, LargestArray.solution(testValueList1));
        int[] testValueList2 = {1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6};
        assertArrayEquals(new int[]{0, 7}, LargestArray.solution(testValueList2));
        int[] testValueList3 = {1, 11, 2, 0, 14, 5, 13, 4, 10, 7, 12, 6};
        assertArrayEquals(new int[]{10, 14}, LargestArray.solution(testValueList3));
    }
}
