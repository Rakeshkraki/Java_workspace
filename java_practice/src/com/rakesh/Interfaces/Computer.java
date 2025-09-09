package com.rakesh.Interfaces;

import java.util.SortedMap;

interface Computer {

    void display();
    void keyboard();

    private void powerOn(){
        System.out.println("Loading....");
    }


    public static void setPassword(){
        System.out.println("this is static method");
    }
}
