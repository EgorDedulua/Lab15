package org.example;

public class UserNotFoundException extends Exception {
    private String attemptedUsername;

    public UserNotFoundException(String message, String attemptedUsername) {
        super(message);
        this.attemptedUsername = attemptedUsername;
    }

    public String getAttemptedUsername() {
        return attemptedUsername;
    }
}
