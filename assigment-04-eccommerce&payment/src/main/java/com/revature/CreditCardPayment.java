package com.revature;

public class CreditCardPayment implements Payment {

    @Override
    public String provider() {
        return "Credit Card";
    }

    @Override
    public String processingMessage() {
        return "[CreditCard] Payment is processing...";
    }
}