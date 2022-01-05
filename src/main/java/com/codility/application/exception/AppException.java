package com.codility.application.exception;

/**
 * Created at 05/01/2022.
 *
 * @author: Samet Nargul
 */

public class AppException extends RuntimeException {
    private String message;

    public AppException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
