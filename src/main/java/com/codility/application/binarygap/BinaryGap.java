package com.codility.application.binarygap;

/**
 * Created at 04/01/2022.
 *
 * @author: Samet Nargul
 */

public class BinaryGap {

    private BinaryGap() {}

    //time complexity: O(log n) , since the value, the binary format of n, in loop is already a smaller value according to n
    public static int solution(int n) {
        char[] binaryText = Integer.toBinaryString(n).trim().toCharArray();

        int max = 0;
        int current = 0;

        for (int i = 1; i < binaryText.length; i++) {
            if (binaryText[i] == '0') {
                current++;
            } else {
                if (current > 0)
                    max = Integer.max(max, current);
                current = 0;
            }
        }
        return max;
    }
}
