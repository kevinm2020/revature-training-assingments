package com.revature;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext ctx =
                 new ClassPathXmlApplicationContext("applicationContext.xml")) {

            // Choose which processor to use by bean id
            PaymentProcessor cc = ctx.getBean("ccProcessor", PaymentProcessor.class);
            cc.process(49.99);

            PaymentProcessor pp = ctx.getBean("paypalProcessor", PaymentProcessor.class);
            pp.process(12.50);
        }
    }
}