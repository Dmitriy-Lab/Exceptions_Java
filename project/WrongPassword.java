package org.example;

public class WrongPassword extends Exception {
    private String detail;

    public WrongPassword() {
        detail = "Incorrect password";
    }

    public WrongPassword(String message) {
        super(message);
        detail = message;
    }

    @Override
    public String toString() {
        return "WrongPassword: " + detail;
    }
}
