package com.Prashant.Interface.Inherit;

public class Main {
    public static void main(String[] args) {
        Check check=new Check();
        check.fun();
        check.funB();
        B b=new Check();
        b.fun();
        b.funB();
        b.funC();
        b.funD();
        A a=new Check();
        a.fun();
        // a.funB(); // Error
        A.foo1();
        //a.foo1(); // Error
        check.foo1();
    }
}
