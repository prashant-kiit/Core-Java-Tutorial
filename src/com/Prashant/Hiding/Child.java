package com.Prashant.Hiding;

public class Child extends Parent{
//    @Override //This is overriding. This is not hiding
    void foo() {
        System.out.println("This is Child");
    }
    //@Override This not overriding. This is hiding
    static void fun() {
        System.out.println("This is Child");
    }
}
