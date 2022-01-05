package com.codility.application.frogjump;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrogJumpTest {

    @Test
    void testSolution() {
        assertEquals(3, FrogJump.solution(10, 85, 30));
        assertEquals(0, FrogJump.solution(10, 10, 30));
    }

}
