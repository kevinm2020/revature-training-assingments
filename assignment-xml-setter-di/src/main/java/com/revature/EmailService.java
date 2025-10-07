package com.revature;

public class EmailService {
    public void send(String to, String message) {
        System.out.println("[EmailService] Sending to " + to + ": " + message);
    }
}