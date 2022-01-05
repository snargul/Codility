package com.codility.application.maxdoubleslicesum;

import com.codility.application.exception.AppException;

/**
 * Created at 05/01/2022.
 *
 * @author: Samet Nargul
 */

public class MaxDoubleSliceSum {
    private MaxDoubleSliceSum() {
    }

    private static void validateValue(int value) {
        if (value < -10000 || value > 10000)
            throw new AppException("Array values should be between [-10000..10000]");
    }

    //Time Complexity: O(n) from O(3*n)
    public static int solution(int[] array) {
        if (array.length < 3 || array.length > 100000)
            throw new AppException("Array length should be between [3..100000]");
        validateValue(array[0]);

        // Consider the starting position of double slice:
        // First, get a position at the first index
        // This means that we can not add the value at that index to the summation
        // If we slice the position, then we know that the values at the previous indexes are
        // also can not be added to the summation
        // Therefore, we should check the if current value is bigger than the sum of the prev and current
        // except the first index (in order to do not calculate value at first index, remain the sum as 0)
        // In order to holding the summations, let's create a summation array for starting position
        int [] startSums = new int[array.length];
        for (int i = 1; i < array.length - 1; i++) {
            validateValue(array[i]);

            startSums[i] = Math.max(startSums[i - 1] + array[i], array[i]); //if array[i] is bigger, choose it.
                                                                            // This means we are sliding
                                                                            // the starting position
            if (startSums[i] < 0)
                startSums[i] = 0;       // Ignoring means 0, 0 is bigger than minus values
        }

        // Consider the ending position of double slice:
        // First, get a position at the last index
        // This means that we can not add the value at that index to the summation
        // If we slice the position, then we know that the values at the next indexes are
        // also can not be added to the summation
        // Therefore, we should check the if current value is bigger than the sum of the next and current
        // except the last index (in order to do not calculate value at last index, remain the sum as 0)
        // In order to holding the summations, let's create a summation array for ending position
        int [] endSums = new int[array.length];
        for (int i = array.length - 2; i > 0; i--) {
            endSums[i] = Math.max(endSums[i + 1] + array[i], array[i]); //if array[i] is bigger, choose it.
                                                                        // This means we are sliding
                                                                        // the ending position
            if (endSums[i] < 0)
                endSums[i] = 0;       // Ignoring means 0, 0 is bigger than minus values
        }

        // We already set the starting and ending positions and get the summation lists according them
        // Now, we take a middle position and sliding from start to end, then calculate the sum of
        // sum values at the both sides and get the biggest
        int max = 0;
        for (int i = 1; i < array.length - 1; i++) {
            max = Math.max(startSums[i - 1] + endSums[i + 1], max);
        }
        return max;
    }
}
