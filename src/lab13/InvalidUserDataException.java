package org.example;

public class InvalidUserDataException extends RuntimeException {
    private String field;

    public InvalidUserDataException(String message, String field) {
        super(message);
        this.field = field;
    }

    public String getField() {
        return field;
    }
}
