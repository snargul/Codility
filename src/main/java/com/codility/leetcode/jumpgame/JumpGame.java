package com.codility.leetcode.jumpgame;

/**
 * Created at 05/01/2022.
 *
 * @author: Samet Nargul
 */

public class JumpGame {

    private JumpGame() {}

    private static int[] popBefore(int[] array, int maxIndex) {
        int[] newArray = new int[array.length - maxIndex];
        for (int i = maxIndex; i < array.length; i++) {
            newArray[i - maxIndex] = array[i];
        }
        return newArray;
    }

    private static int[] arrayStartsWithMaxValue(int[] array) {
        int jumper = array[0];
        if (jumper >= array.length - 1)
            return new int[]{};

        int max = 0;
        int maxIndex = 0;
        for (int i = 1; i < jumper + 1; i++) {
            if (array[i] >= max) {
                max = array[i];
                maxIndex = i;
            }
        }
        return popBefore(array, maxIndex);
    }

    //Time Complexity: O(n*n) = arrayStartsWithMaxValue(O(n)) * popBefore(O(n))
    public static int solution(int[] array) {

        if (array.length < 1)
            return array.length;

        int jumpCounter = 0;
        while (array.length > 0) {
            array = arrayStartsWithMaxValue(array);
            jumpCounter++;
        }

        return jumpCounter;
    }

    //Time Complexity: O(n)
    public static int fasterSolution(int[] array) {

        if (array.length < 1)
            return array.length;

        //At start, we know that the max index that we can jump is the value at the first index.
        int maxReachableIndex = array[0];
        int jumpCounter = 1;
        int jumpRange = array[0];

        for (int i = 1; i < array.length; i++) {
            if (i > jumpRange) {
                jumpCounter++;
                jumpRange = maxReachableIndex;
            }
            maxReachableIndex = Math.max(maxReachableIndex, (i + array[i]));
        }

        return jumpCounter;
    }
}
