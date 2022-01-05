package com.codility.application.passingcars;

import java.util.ArrayList;
import java.util.List;

/**
 * Created at 05/01/2022.
 *
 * @author: Samet Nargul
 */

public class PassingCars {
    private PassingCars() {
    }

    //Time Complexity: O(n)
    public static int solution(int[] array) {
        int eastCount = 0;
        int pairCount = 0;
        int sum = 0;
        for (int number : array) {
            if (number == 0) {
                eastCount++;
            } else {
                if (eastCount > 0) {
                    pairCount += eastCount;
                    eastCount = 0;
                }
                sum += pairCount;
                if (sum > 1000000000)
                    return -1;
            }
        }
        return sum;
    }
}
