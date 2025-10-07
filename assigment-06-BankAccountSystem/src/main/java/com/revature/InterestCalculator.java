package com.revature;

import org.springframework.stereotype.Service;

@Service
public class InterestCalculator {

    // annualRatePercent e.g., 3.5 for 3.5% APR
    public double monthlyInterest(double balance, double annualRatePercent) {
        double rate = annualRatePercent / 100.0;
        return balance * (rate / 12.0);
    }
}

/**
 * Calculates interest for accounts.
 *
 * Marked as @Service so Spring will discover and manage it as a bean.
 */