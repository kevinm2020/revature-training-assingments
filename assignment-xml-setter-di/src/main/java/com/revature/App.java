package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx =new ClassPathXmlApplicationContext("applicationContext.xml");

        NotificationService ns =
            ctx.getBean("notificationService", NotificationService.class);

        ns.sendWelcome("student@revature.com");
    }
}