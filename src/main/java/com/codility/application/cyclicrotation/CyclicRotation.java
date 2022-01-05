package com.codility.application.cyclicrotation;

import com.codility.application.exception.AppException;

/**
 * Created at 05/01/2022.
 *
 * @author: Samet Nargul
 */

public class CyclicRotation {

    private CyclicRotation() {}

    private static int[] shiftByOne(int[] array) {
        int lastValue = array[array.length - 1];
        validateValue(lastValue);

        for (int i = array.length - 1; i >= 1; i--) {
            validateValue(array[i - 1]);
            array[i] = array[i - 1];
        }

        array[0] = lastValue;
        return array;
    }

    //time complexity: O(n) from O(kn)
    public static int[] solution(int[] array, int kTimes) {
        validateInputs(array, kTimes);

        if (kTimes != 0 && kTimes != array.length) {

            for (int i = 0; i < kTimes; i++) {
                array = shiftByOne(array);
            }

        } else {
            for (int each : array)
                validateValue(each);
        }
        return array;
    }

    //time complexity: O(n)
    public static int[] fasterSolution(int[] array, int kTimes) {
        validateInputs(array, kTimes);

        if (kTimes != 0 && kTimes != array.length) {

            int[] newArray = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                validateValue(array[i]);

                if (array.length - i > kTimes)
                    newArray[i + kTimes] = array[i];
                else
                    newArray[i - (array.length - kTimes)] = array[i];
            }
            return newArray;

        } else {
            for (int each : array)
                validateValue(each);
            return array;
        }
    }

    private static void validateInputs(int[] array, int kTimes) {
        if (kTimes > 100 || kTimes < 0)
            throw new AppException("k times can be between [0..100]");
        if (array.length > 100)
            throw new AppException("array length can be max 100");
    }

    private static void validateValue(int arrayValue) {
        if (arrayValue > 1000 || arrayValue < -1000)
            throw new AppException("each array value can be between [-1000..1000]");
    }
}
