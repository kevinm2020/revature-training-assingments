package com.revature;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary                     // optional: treat PayPal as default Payment
@Component("paypalPayment")
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