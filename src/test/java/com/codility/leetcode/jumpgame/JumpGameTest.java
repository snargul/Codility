package com.codility.leetcode.jumpgame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpGameTest {

    @Test
    void testSolution() {
        int[] testValueList1 = {2, 3, 1, 1, 4};
        assertEquals(2, JumpGame.solution(testValueList1));
        int[] testValueList2 = {2, 2, 1, 1, 4};
        assertEquals(3, JumpGame.solution(testValueList2));
        int[] testValueList3 = {2, 4, 2, 1, 4, 3, 2};
        assertEquals(3, JumpGame.solution(testValueList3));
        int[] testValueList4 = {2, 3, 2, 1, 4, 3, 2, 3, 1, 1, 1};
        assertEquals(4, JumpGame.solution(testValueList4));
        int[] testValueList5 = {1};
        assertEquals(1, JumpGame.solution(testValueList5));
    }

    @Test
    void testFasterSolution() {
        int[] testValueList1 = {2, 3, 1, 1, 4};
        assertEquals(2, JumpGame.fasterSolution(testValueList1));
        int[] testValueList2 = {2, 2, 1, 1, 4};
        assertEquals(3, JumpGame.fasterSolution(testValueList2));
        int[] testValueList3 = {2, 4, 2, 1, 4, 3, 2};
        assertEquals(3, JumpGame.fasterSolution(testValueList3));
        int[] testValueList4 = {2, 3, 2, 1, 4, 3, 2, 3, 1, 1, 1};
        assertEquals(4, JumpGame.fasterSolution(testValueList4));
        int[] testValueList5 = {1};
        assertEquals(1, JumpGame.fasterSolution(testValueList5));
    }
}
