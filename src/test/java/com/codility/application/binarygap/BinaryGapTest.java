package com.codility.application.binarygap;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created at 04/01/2022.
 *
 * @author: Samet Nargul
 */

class BinaryGapTest {

    @DisplayName("Test binary gap")
    @Test
    void testSolution() {
        int[] testValues = {9, 529, 20, 15, 32, 1041};
        int[] expResults = {2,   4,  1,  0,  0,    5};
        assertAll("longest binary gap length",
                () -> assertEquals(expResults[0], BinaryGap.solution(testValues[0])),
                () -> assertEquals(expResults[1], BinaryGap.solution(testValues[1])),
                () -> assertEquals(expResults[2], BinaryGap.solution(testValues[2])),
                () -> assertEquals(expResults[3], BinaryGap.solution(testValues[3])),
                () -> assertEquals(expResults[4], BinaryGap.solution(testValues[4])),
                () -> assertEquals(expResults[5], BinaryGap.solution(testValues[5]))
        );
    }
}
