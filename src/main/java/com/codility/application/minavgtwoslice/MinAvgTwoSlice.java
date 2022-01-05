package com.codility.application.minavgtwoslice;

/**
 * Created at 05/01/2022.
 *
 * @author: Samet Nargul
 */

public class MinAvgTwoSlice {
    private MinAvgTwoSlice() {
    }


    //Time Complexity: O(n*n) If we have chosen only two number and three number pairs, then it will be O(n)
    public static int solution(int[] array) {

        int minIndex = -1;
        double minAvg = Integer.MAX_VALUE;

        for (int pair = 2; pair < array.length; pair++) {

            for (int i = pair; i <= array.length; i++) {
                int sum = 0;
                for (int j = i - pair; j < i; j++) {
                    sum += array[j];
                }
                double avg = sum / (double) pair;
                if (avg < minAvg) {
                    minAvg = avg;
                    minIndex = i - pair;
                }
            }

        }
        return minIndex;
    }
}
