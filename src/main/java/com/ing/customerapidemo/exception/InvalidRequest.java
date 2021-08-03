package com.ing.customerapidemo.exception;

public class InvalidRequest extends RuntimeException {

    public InvalidRequest(String message) {
        super(message);
    }

    public InvalidRequest(String message, Throwable cause) {
        super(message, cause);
    }
}
