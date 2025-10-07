package com.revature;

public class EmailService implements MessageService {

    @Override
    public String getMessage() {
        return "Welcome via EMAIL! Thanks for signing up.";
    }

    @Override
    public void sendMessage(String to, String message) {
        System.out.println("[EmailService] Sending to " + to + ": " + message);
    }
}