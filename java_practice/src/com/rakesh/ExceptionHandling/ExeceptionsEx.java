package com.rakesh.ExceptionHandling;

public class ExeceptionsEx {

    public static void exceptionHanlingEx(int a, int b) {

        try{
            int c = a/b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }finally {
            System.out.println("this is compulsory");
        }
    }
}
