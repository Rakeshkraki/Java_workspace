package com.rakesh.AccessModifiers;

public class ClassB{

    public static void getGreeting(){
        ClassA.greet1();
        //ClassA.greet2();
        ClassA.greet3();
    }
}
