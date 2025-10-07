package com.revature;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.revature")   // finds @Component classes
public class AppConfig {

    @Bean("ccProcessor")
    public PaymentProcessor ccProcessor(@Qualifier("creditCardPayment") Payment payment) {
        PaymentProcessor p = new PaymentProcessor();
        p.setPayment(payment);   // setter DI
        return p;
    }

    @Bean("paypalProcessor")
    public PaymentProcessor paypalProcessor(@Qualifier("paypalPayment") Payment payment) {
        PaymentProcessor p = new PaymentProcessor();
        p.setPayment(payment);   // setter DI
        return p;
    }
}
