package com.rakesh.Encapsulation;

public class Polymorphism {

    private String name;
    private int age;

    public static void main(String[] args) {
        Polymorphism obj1 = new Polymorphism();
        obj1.setValue(10);
        obj1.setValue(100,"Rakesh K");

        System.out.println(obj1.name + " " + obj1.age);
    }

    public void setValue(int value){
        this.age = value;
    }

    public void setValue(int value,String name){
        this.age = value;
        this.name = name;
    }

    public void setValue(String name){
        this.name = name;
    }


}
