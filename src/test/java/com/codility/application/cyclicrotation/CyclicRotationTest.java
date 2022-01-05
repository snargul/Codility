package com.codility.application.cyclicrotation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Created at 05/01/2022.
 *
 * @author: Samet Nargul
 */

public class CyclicRotationTest {

    @DisplayName("Test Cyclic Rotation to Right")
    @Test
    void testSolution() {
        assertArrayEquals(new int[]{6, 3, 8, 9, 7}, CyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, 1));
        assertArrayEquals(new int[]{9, 7, 6, 3, 8}, CyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, 3));
        assertArrayEquals(new int[]{0, 0, 0}, CyclicRotation.solution(new int[]{0, 0, 0}, 1));
        assertArrayEquals(new int[]{1, 2, 3, 4}, CyclicRotation.solution(new int[]{1, 2, 3, 4}, 4));
    }

    @DisplayName("Test Faster Cyclic Rotation to Right")
    @Test
    void testFasterSolution() {
        assertArrayEquals(new int[]{6, 3, 8, 9, 7}, CyclicRotation.fasterSolution(new int[]{3, 8, 9, 7, 6}, 1));
        assertArrayEquals(new int[]{9, 7, 6, 3, 8}, CyclicRotation.fasterSolution(new int[]{3, 8, 9, 7, 6}, 3));
        assertArrayEquals(new int[]{0, 0, 0}, CyclicRotation.fasterSolution(new int[]{0, 0, 0}, 1));
        assertArrayEquals(new int[]{1, 2, 3, 4}, CyclicRotation.fasterSolution(new int[]{1, 2, 3, 4}, 4));
    }
}
