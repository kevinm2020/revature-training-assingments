package com.revature;

public class SmsService implements MessageService {

    @Override
    public String getMessage() {
        return "Welcome via SMS! Thanks for signing up.";
    }

    @Override
    public void sendMessage(String to, String message) {
        System.out.println("[SmsService] Sending to " + to + ": " + message);
    }
}