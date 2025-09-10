package com.rakesh.Abstraction;

public class UPIPayment implements Payment{

    public void pay(double amount){
        System.out.println("amount paid" + "---" + amount);
    }
}
