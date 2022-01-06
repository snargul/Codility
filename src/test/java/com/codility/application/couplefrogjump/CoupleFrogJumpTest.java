package com.codility.application.couplefrogjump;

import com.codility.application.couplefrogjump.CoupleFrogJump;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CoupleFrogJumpTest {

    @Test
    void testSolution() {
        assertEquals(3, CoupleFrogJump.solution(new int[]{2, 6, 8, 5}));
        assertEquals(4, CoupleFrogJump.solution(new int[]{1, 5, 5, 2, 6}));
        assertEquals(2, CoupleFrogJump.solution(new int[]{1, 1}));
    }
}
