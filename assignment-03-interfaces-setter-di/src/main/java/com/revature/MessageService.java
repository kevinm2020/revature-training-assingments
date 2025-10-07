package com.revature;


public interface MessageService {
    String getMessage();
    void sendMessage(String to, String message);
}