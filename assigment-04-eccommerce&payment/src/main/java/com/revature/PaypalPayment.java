package com.revature;

public class PaypalPayment implements Payment {

    @Override
    public String provider() {
        return "PayPal";
    }

    @Override
    public String processingMessage() {
        return "[PayPal] Payment is processing...";
    }
}