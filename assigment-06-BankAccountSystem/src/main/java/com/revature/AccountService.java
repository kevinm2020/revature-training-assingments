package com.revature;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private final TransactionService tx;
    private final InterestCalculator interest;

    @Autowired 
    public AccountService(TransactionService tx, InterestCalculator interest) {
        this.tx = tx;
        this.interest = interest;
    }

    public double open(double opening) {
        if (opening < 0) throw new IllegalArgumentException("opening must be >= 0");                    //basic bank account operations
        return opening;
    }

    public double deposit(double balance, double amount) {
        return tx.deposit(balance, amount);
    }

    public double withdraw(double balance, double amount) {
        return tx.withdraw(balance, amount);
    }

    public double applyMonthlyInterest(double balance, double annualRatePercent) {
        return balance + interest.monthlyInterest(balance, annualRatePercent);
    }
}

/**
 * Orchestrates account operations by delegating to:
 * - TransactionService (deposits/withdrawals)
 * - InterestCalculator (interest application)
 *
 * This class uses **constructor injection**, which:
 * - Makes dependencies required and explicit.
 * - Enables final fields and easier testing.
 * - Is the modern recommended style in Spring.
 */