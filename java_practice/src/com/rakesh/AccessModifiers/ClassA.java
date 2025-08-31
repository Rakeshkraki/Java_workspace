package com.rakesh.AccessModifiers;

public class ClassA {
    public static void greet1(){
        System.out.println("Hello Rakesh");
    }
    private static void greet2(){
        System.out.println("Hello Rakesh from Private");

    }
    protected static void greet3(){
        System.out.println("Hello Rakesh from Protected");
    }
}
