package com.revature;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext ctx =
                     new ClassPathXmlApplicationContext("applicationContext.xml")) {

            NotificationClient emailClient = ctx.getBean("emailClient", NotificationClient.class);
            NotificationClient smsClient   = ctx.getBean("smsClient",   NotificationClient.class);

            emailClient.notifyUser("student@revature.com");
            smsClient.notifyUser("+1-555-123-4567");
        }
    }
}
