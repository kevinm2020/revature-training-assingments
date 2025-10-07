package com.revature;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext ctx =
                 new AnnotationConfigApplicationContext(AppConfig.class)) {                     //loads configuration class for scanning

            PaymentProcessor cc = ctx.getBean("ccProcessor", PaymentProcessor.class);           //get cc processor bean
            cc.process(49.99);                                                           //use bean

            PaymentProcessor pp = ctx.getBean("paypalProcessor", PaymentProcessor.class);        //get pp processor bean
            pp.process(12.50);                                                             //use bean
        }
    }
}