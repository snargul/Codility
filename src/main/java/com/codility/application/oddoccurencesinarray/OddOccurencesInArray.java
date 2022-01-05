package com.codility.application.oddoccurencesinarray;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created at 05/01/2022.
 *
 * @author: Samet Nargul
 */

public class OddOccurencesInArray {
    private OddOccurencesInArray() {
    }

    // Time Complexity: O(n)
    public static int solution(int[] array) {
        Map<Integer, Integer> hashList = new HashMap<>();
        for (int number : array) {
            if (hashList.containsKey(number))
                hashList.remove(number);
            else
                hashList.put(number, 0);
        }
        if (hashList.size() == 0)
            return 0;
        Set<Integer> keySet = hashList.keySet();
        return keySet.iterator().next();
    }
}
