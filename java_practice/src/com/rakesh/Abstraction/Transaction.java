package com.rakesh.Abstraction;

public class Transaction {

    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        Payment transaction1 = new CreditCardPayment();
        Payment transaction2 = new UPIPayment();

        processor.makePayment(transaction1,1000d);
        processor.makePayment(transaction2,200d);
    }
}
