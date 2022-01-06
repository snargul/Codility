package com.codility.application.flags;

import java.util.ArrayList;
import java.util.List;

/**
 * Created at 06/01/2022.
 *
 * @author: Samet Nargul
 */

public final class Flags {

    private Flags() {
    }

    //Time Complexity: O(n*log(n))
    public static int solution(int[] array) {
        if (array.length < 1 || array.length > 4000000)
            return 0;

        int lastFlagIndex = -1;
        List<Integer> flagList = new ArrayList<>();
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i - 1] &&
                    array[i] > array[i + 1] &&
                    i > lastFlagIndex + flagList.size() + 1) {
                lastFlagIndex = i;
                flagList.add(i);

            }
        }

        for (int flagCount = flagList.size() - 1; flagCount > 0; flagCount--) {
            Integer startFlag = flagList.get(0);
            int counter = 1;
            for (int j = 1; j < flagList.size(); j++) {
                if (flagList.get(j) > startFlag + flagCount)
                    counter++;
            }
            if (counter == flagCount)
                return flagCount;
        }

        return flagList.size();
    }
}
