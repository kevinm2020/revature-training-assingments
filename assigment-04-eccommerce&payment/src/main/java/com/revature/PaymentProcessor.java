package com.revature;

public class PaymentProcessor {

    private Payment payment; // injected by Spring via SETTER

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void process(double amount) {
        // "payment is processing..."
        System.out.println(payment.processingMessage());
        // "...has been processed with PayPal or Credit Card"
        System.out.println("Payment of $" + amount + " has been processed with " + payment.provider() + ".");
    }
}