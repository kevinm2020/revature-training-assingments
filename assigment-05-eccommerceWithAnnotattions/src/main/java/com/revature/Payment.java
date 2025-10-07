package com.revature;

public interface Payment {
    String provider();               // e.g., "Credit Card" or "PayPal"
    String processingMessage();      // e.g., "Processing payment via Credit Card..."
}

//interface, cc and pp use payment