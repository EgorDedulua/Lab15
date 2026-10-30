package org.example;

public class AuthenticationException extends Exception {
    private String attemptedPassword;

    public AuthenticationException(String message, String attemptedPassword) {
        super(message);
        this.attemptedPassword = attemptedPassword;
    }

    public String getAttemptedPassword() {
        return attemptedPassword;
    }
}
