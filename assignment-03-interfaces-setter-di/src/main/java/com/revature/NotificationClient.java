package com.revature;

public class NotificationClient {

    private MessageService messageService; // Injected via SETTER

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void notifyUser(String to) {
        String body = messageService.getMessage();
        messageService.sendMessage(to, body);
    }
}