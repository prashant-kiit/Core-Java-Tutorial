package com.Prashant.Exception;

public class Main {
    // Fully Custom Exception Handling
    static int add4(int a, int b) throws MyException {
        try {
            if (a == 0 || b == 0) {
                throw new MyException("ErrorCode 100: ZeroAsInput");
            }
        } catch (MyException e) {
            throw new MyException(e.getMessage());
        }
        finally {
            System.out.println("This will run under any situation");
        }
        return a+b;
    }
    // Built-in Exception Handling
    static  int divide(int a, int b) {
        return b/a;
    }
    static int add3(int a, int b) {
        try {
            int c=divide(b,a);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
        return a+b;
    }
    // Partially Custom Exception Handling
    static int add2(int a, int b) throws Exception {
        // Longer Method
        try {
            if (a == 0 || b == 0) {
                throw new Exception(String.valueOf(100));
            }
            if (a == -1 || b == -1) {
                throw new Exception(String.valueOf(200));
            }
            if (a==b) {
                throw new ArithmeticException(String.valueOf(300));
            }
        }
        catch (ArithmeticException e) {
            throw new Exception("ErrorCode 300: ArithmeticException");
        }
        catch (Exception e) {
            if (e.getMessage().equals("100")) {
                throw new Exception("ErrorCode 100: ZeroAsInput");
            }
            if (e.getMessage().equals("100")) {
                throw new ArithmeticException("ErrorCode 100: ZeroAsInput(ArithmeticException)");
            }
            if (e.getMessage().equals("200")) {
                System.out.println("Warning: NegativeAsInput");
            }
        }
        return a+b;
    }
    static int add(int a, int b) throws Exception {
        //Shorter Method
        if (a==0 || b==0) {
            throw new Exception("ErrorCode 100: ZeroAsInput");
        }
        if (a==-1 || b==-1) {
            throw new Exception("ErrorCode 200: NegativeAsInput");
        }
        return a+b;
    }
    public static void main(String[] args) throws Exception, MyException {
        System.out.println(add(0,3));
        System.out.println(add2(9,9));
        System.out.println(add3(9,9));
        System.out.println(add4(0,9));
    }
}
