package com.rakesh.AccessModifiers;

 class ClassC {

    public static void getGreeting2(){
        ClassA.greet1(); // public method
        // ClassA.greet2(); Private Method not Accessable
        ClassA.greet3(); // Protected Method
    }
}
