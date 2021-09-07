package com.learnreactivespring.fluxandmonoplayground;

/**
 * Créé par dmitri le 2021-09-06.
 */
public class CustomException extends Throwable {

    private String message;

    public CustomException(Throwable e) {
        this.message = e.getMessage();
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
