package com.revature;

import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    public double deposit(double balance, double amount) {
        if (amount < 0) throw new IllegalArgumentException("amount must be >= 0");
        return balance + amount;
    }

    public double withdraw(double balance, double amount) {
        if (amount < 0) throw new IllegalArgumentException("amount must be >= 0");
        if (amount > balance) throw new IllegalArgumentException("insufficient funds");
        return balance - amount;
    }
}

/**
 * Handles transactional operations on an account balance.
 *
 * Annotated with @Service to mark it as a Spring-managed component
 * in the "service" layer. Spring will auto-detect and instantiate it
 * because of @ComponentScan in AppConfig.
 */