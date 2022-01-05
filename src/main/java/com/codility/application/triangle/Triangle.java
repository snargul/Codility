package com.codility.application.triangle;

import com.codility.application.exception.AppException;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created at 05/01/2022.
 *
 * @author: Samet Nargul
 */

public class Triangle {
    private Triangle() {
    }

    //Time Complexity: O(n*log(n))
    public static int solution(int[] array) {
        if (array.length < 3)
            return 0;

        Arrays.sort(array);

        for (int i = 0; i < array.length - 2; i++) {
            if ((long) array[i] + (long) array[i + 1] > array[i + 2])
                return 1;
        }
        return 0;
    }
}
