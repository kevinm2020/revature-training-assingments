package com.revature;

import org.springframework.beans.factory.annotation.Autowired;

public class PaymentProcessor {

    private Payment payment; // injected

    // Setter injection (still using annotations)
    @Autowired                                                      //autowire payment dependancy (cc or pp)
    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void process(double amount) {                        //process payment
        System.out.println(payment.processingMessage());
        System.out.println("Payment of $" + amount + " has been processed with " + payment.provider() + ".");
    }
}