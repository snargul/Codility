package com.codility.application.peak;

import java.util.ArrayList;
import java.util.List;

/**
 * Created at 06/01/2022.
 *
 * @author: Samet Nargul
 */

public class Peak {
    private Peak() {
    }

    //Time Complexity: O(n*log(n))
    public static int solution(int[] array) {
        if (array.length < 1 ||
                array.length > 100000 ||
                isInvalidVal(array[0]) ||
                isInvalidVal(array[array.length - 1]))
            return -1;

        List<Integer> peakList = new ArrayList<>();
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1])
                peakList.add(i);
        }

        for (int blockCount = peakList.size(); blockCount > 0; blockCount--) {
            int selectedPeak = 0;
            int partLength = array.length / blockCount;
            for (int i = partLength - 1; i < array.length; i+=partLength) {
                Integer peak = peakList.get(selectedPeak);
                if (peak > i)
                    break;
                selectedPeak++;
            }
            if (selectedPeak == blockCount)
                return blockCount;
        }
        return 0;
    }

    private static boolean isInvalidVal(int i) {
        return i < 0 || i > 1000000000;
    }
}
