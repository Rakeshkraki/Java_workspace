package com.rakesh.Abstraction;

public class PaymentProcessor {

    public void makePayment(Payment payment, double amount){
        payment.pay(amount);
    }
}
