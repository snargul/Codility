package com.codility.application.frogjump;

import com.codility.application.exception.AppException;

/**
 * Created at 05/01/2022.
 *
 * @author: Samet Nargul
 */

public class FrogJump {
    private FrogJump() {
    }

    //Time Complexity : O(1)
    public static int solution(int position, int destination, int jumpDistance) {
        if (jumpDistance <= 0)
            throw new AppException("Jump distance should be greater than 0");
        if (destination < position)
            throw new AppException("Destination can not be smaller than position");

        int distance = destination - position;
        return (int) Math.ceil(distance / (double) jumpDistance);
    }
}
