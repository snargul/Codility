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
        HashSet<Integer> sortedArray = new HashSet<>();
        for (int i = 1; i < array.length; i++) {
            sortedArray.add(i);
        }

        for (int value : array)
            sortedArray.remove(value);
        return sortedArray.iterator().next();
    }
}
