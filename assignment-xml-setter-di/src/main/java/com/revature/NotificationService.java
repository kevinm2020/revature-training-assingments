package com.revature;

public class NotificationService {

    // dependency to be injected by Spring via setter
    private EmailService emailService;

    // SETTER injection point
    public void setEmailService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void sendWelcome(String to) {
        emailService.send(to, "Welcome! Thanks for signing up.");
    }
}
