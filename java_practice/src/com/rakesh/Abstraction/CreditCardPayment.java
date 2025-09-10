package com.rakesh.Abstraction;

public class CreditCardPayment implements Payment{

    public void pay(double amount){
        System.out.println("amount paid" + "---" + amount);
    }

}
