package com.codility.application.countnondivisible;

import com.codility.application.exception.AppException;

/**
 * Created at 05/01/2022.
 *
 * @author: Samet Nargul
 */

public class CountNonDivisible {
    private CountNonDivisible() {
    }

    private static void validateValue(int value, int arrayLength) {
        if (value < 0 || value > 2 * arrayLength)
            throw new AppException("Value should be between [1..(2 * array length)]");
    }

    //Time Complexity: O(n*n)
    public static int[] solution(int[] array) {
        if (array.length == 0 || array.length > 50000)
            throw new AppException("Array length should be between [1..50000]");

        int[] nonDivCountList = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            validateValue(array[i], array.length);

            int nonDivCount = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] % array[j] != 0)
                    nonDivCount++;
            }
            nonDivCountList[i] = nonDivCount;
        }

        return nonDivCountList;
    }
}
