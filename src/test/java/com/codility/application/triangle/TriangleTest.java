package com.codility.application.triangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void testSolution() {
        assertEquals(1, Triangle.solution(new int[]{10, 2, 5, 1, 8, 20}));
        assertEquals(0, Triangle.solution(new int[]{10, 50, 5, 1}));
    }
}
