package com.rakesh.AccessModifiers;

public class Singleton {

    private Singleton(){}

    private static Singleton instance;

    public static Singleton getInstance(){
        return (instance == null) ? instance = new Singleton() : instance;
    }
}
