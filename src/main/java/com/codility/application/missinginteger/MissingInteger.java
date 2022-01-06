package com.codility.application.missinginteger;

import java.util.HashSet;

/**
 * Created at 05/01/2022.
 *
 * @author: Samet Nargul
 */

public class MissingInteger {
    private MissingInteger() {
    }
    public static int solution(int[] array) {
        int lastValue = 1;
        HashSet<Integer> sortedArray = new HashSet<>();
        for (int i = 1; i < array.length; i++) {
            sortedArray.add(i);
            if (i == array.length - 1)
                lastValue = array[i];
        }

        for (int value : array)
            sortedArray.remove(value);

        if (sortedArray.isEmpty()) {
            return Math.max(lastValue + 1, 1);
        }

        return sortedArray.iterator().next();
    }
}
