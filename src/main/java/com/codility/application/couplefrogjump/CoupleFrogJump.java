package com.codility.application.couplefrogjump;

/**
 * Created at 06/01/2022.
 *
 * @author: Samet Nargul
 */

public class CoupleFrogJump {
    private CoupleFrogJump() {
    }

    private static boolean isInvalidArray(int[] array) {
        return array.length < 2 || array.length > 200000;
    }

    private static boolean isInvalidValue(int value) {
        return value < 1 || value > 1000000000;
    }

    //This task gets %33 performance result. It should be improved.
    public static int solution(int[] blocks) {
        if (isInvalidArray(blocks))
            return 0;

        int maxRightIndex = 0;
        int maxLeftIndex = 0;
        int rightIndex = 0;
        int leftIndex = 0;
        for (int i = 0; i < blocks.length; i++) {
            if (isInvalidValue(blocks[i]))
                return 0;

            // check right
            int rightValue = blocks[i];
            for (int j = i + 1; j < blocks.length; j++) {
                if (blocks[j] >= rightValue) {
                    rightIndex = j;
                    rightValue = blocks[j];
                } else {
                    break;
                }
            }
            // check left
            int leftValue = blocks[i];
            for (int j = i - 1; j >= 0; j--) {
                if (blocks[j] >= leftValue) {
                    leftIndex = j;
                    leftValue = blocks[j];
                } else {
                    break;
                }
            }
            if (rightIndex - leftIndex > maxRightIndex - maxLeftIndex) {
                maxRightIndex = rightIndex;
                maxLeftIndex = leftIndex;
            }
        }

        return maxRightIndex - maxLeftIndex + 1;
    }
}
