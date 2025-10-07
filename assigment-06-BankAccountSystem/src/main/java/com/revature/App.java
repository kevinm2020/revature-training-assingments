package com.revature;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext ctx =                                   //component scan
                 new AnnotationConfigApplicationContext(AppConfig.class)) {

            AccountService accounts = ctx.getBean(AccountService.class);                //get bean

            double balance = accounts.open(100.00);                                     //use bean
            balance = accounts.deposit(balance, 50.00);
            balance = accounts.applyMonthlyInterest(balance, 3.0); // 3% APR, one month
            balance = accounts.withdraw(balance, 40.00);

            System.out.printf("Final balance: $%.2f%n", balance);
        }
    }
}

/**
 * Application entry point.
 *
 * Uses AnnotationConfigApplicationContext to boot a Spring container
 * backed by Java configuration (AppConfig). Thanks to @ComponentScan,
 * Spring discovers and wires @Service beans automatically.
 */