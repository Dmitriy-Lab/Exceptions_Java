package org.example;

public class WrongLogin extends Exception {
    private String detail;

    public WrongLogin() {
        detail = "Incorrect login";
    }

    public WrongLogin(String message) {
        super(message);
        detail = message;
    }

    @Override
    public String toString() {
        return "WrongLogin: " + detail;
    }
}
