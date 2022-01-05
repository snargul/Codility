package com.codility.argoexpert.largestarray;

import java.util.HashMap;
import java.util.Map;

/**
 * Created at 05/01/2022.
 *
 * @author: Samet Nargul
 */

public class LargestArray {

    private LargestArray() {}

    // Time Complexity: O(n)
    public static int[] solution(int[] array) {
        //searching a specific value is faster in HashMap (O(1)) than array (O(n))
        //we create a hashmap having array values as key values in order to make searching the prev or next value faster
        Map<Integer, Integer> hashList = new HashMap<>();
        for (int number : array) {
            hashList.put(number, 0);  //0 means that the key value is ready to evaluation
        }

        int rangeLeft = 0;
        int rangeRight = 0;
        for (int number : array) {
            if (hashList.get(number) == 0) {
                int left = findFarestLeft(hashList, number);
                int right = findFarestRight(hashList, number);
                if (rangeRight - rangeLeft <= right - left) {
                    rangeLeft = left;
                    rangeRight = right;
                }
            }
        }

        return new int[]{rangeLeft, rangeRight};
    }

    private static int findFarestLeft(Map<Integer, Integer> hashList, int number) {
        int left = number - 1;

        while (hashList.containsKey(left)) {
            hashList.put(left, 1); //in order to do not evaluate again
            left--;
        }
        return left + 1;
    }

    private static int findFarestRight(Map<Integer, Integer> hashList, int number) {
        int right = number + 1;

        while (hashList.containsKey(right)) {
            hashList.put(right, 1); //in order to do not evaluate again
            right++;
        }
        return right - 1;
    }
}
